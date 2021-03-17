package com.pinnoocle.fruitindustryoptimization.login;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;
import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.fruitindustryoptimization.MainActivity;
import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.bean.LoginModel;
import com.pinnoocle.fruitindustryoptimization.bean.StatusModel;
import com.pinnoocle.fruitindustryoptimization.common.BaseActivity;
import com.pinnoocle.fruitindustryoptimization.nets.DataRepository;
import com.pinnoocle.fruitindustryoptimization.nets.Injection;
import com.pinnoocle.fruitindustryoptimization.nets.RemotDataSource;
import com.pinnoocle.fruitindustryoptimization.utils.CountDownTimerUtils;
import com.pinnoocle.fruitindustryoptimization.utils.FastData;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {

    @BindView(R.id.ed_phone)
    EditText edPhone;
    @BindView(R.id.tv_code)
    TextView tvCode;
    @BindView(R.id.ed_code)
    EditText edCode;
    @BindView(R.id.tv_login)
    TextView tvLogin;
    private DataRepository dataRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.transparent));
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        dataRepository = Injection.dataRepository(this);
        if (!TextUtils.isEmpty(FastData.getToken())) {
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }
    }

    @OnClick({R.id.tv_code, R.id.tv_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_code:
                String telRegex = "[1][3456789]\\d{9}";
                boolean matches = edPhone.getText().toString().matches(telRegex);
                if (TextUtils.isEmpty(edPhone.getText().toString())) {
                    ToastUtils.showToast("请输入手机号码");
                } else if (matches == false) {
                    ToastUtils.showToast("请输入正确的手机号码");
                } else {
                    //获取验证码
                    sendMessages(edPhone.getText().toString());
                }
                break;
            case R.id.tv_login:
                if (TextUtils.isEmpty(edPhone.getText().toString())) {
                    ToastUtils.showToast("请输入手机号码");
                    return;
                }
                if (TextUtils.isEmpty(edCode.getText().toString())) {
                    ToastUtils.showToast("请输入验证码");
                    return;
                }
                login(edPhone.getText().toString(), edCode.getText().toString());
                break;
        }
    }

    private void login(String phone, String code) {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("s", "/api/user/sms_login");
        map.put("wxapp_id", "10001");
        map.put("phone", phone);
        map.put("code", code);
        dataRepository.login(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(LoginActivity.this);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(LoginActivity.this);
                StatusModel statusModel = (StatusModel) data;
                if (statusModel.getCode() == 1) {
                    LoginModel loginModel = new Gson().fromJson(statusModel.getData(), LoginModel.class);
                    FastData.setUserId(loginModel.getUser_id());
                    FastData.setToken(loginModel.getToken());
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    finish();
                } else {
                    ToastUtils.showToast(statusModel.getMsg());
                }
            }
        });
    }

    private void sendMessages(String phone) {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("s", "/api/user/send_sms");
        map.put("wxapp_id", "10001");
        map.put("phone", phone);
        dataRepository.sms(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(LoginActivity.this);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(LoginActivity.this);
                StatusModel statusModel = (StatusModel) data;
                if (statusModel.getCode() == 1) {
                    ToastUtils.showToast("发送成功");
                    getCode();
                } else {
                    ToastUtils.showToast(statusModel.getMsg());
                }
            }
        });
    }

    private void getCode() {
        CountDownTimerUtils countDownTimerUtils = new CountDownTimerUtils(tvCode, 60000, 1000);
        countDownTimerUtils.start();
    }
}