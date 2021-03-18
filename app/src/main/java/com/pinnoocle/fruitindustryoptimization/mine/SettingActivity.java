package com.pinnoocle.fruitindustryoptimization.mine;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.luck.picture.lib.PictureSelector;
import com.luck.picture.lib.config.PictureConfig;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.entity.LocalMedia;
import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pedaily.yc.ycdialoglib.dialog.select.CustomSelectDialog;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.bean.ImageModel;
import com.pinnoocle.fruitindustryoptimization.bean.StatusModel;
import com.pinnoocle.fruitindustryoptimization.bean.UserInfoDetailModel;
import com.pinnoocle.fruitindustryoptimization.bean.UserInfoModel;
import com.pinnoocle.fruitindustryoptimization.common.BaseActivity;
import com.pinnoocle.fruitindustryoptimization.nets.DataRepository;
import com.pinnoocle.fruitindustryoptimization.nets.Injection;
import com.pinnoocle.fruitindustryoptimization.nets.RemotDataSource;
import com.pinnoocle.fruitindustryoptimization.utils.FastData;
import com.pinnoocle.fruitindustryoptimization.utils.StatusBarUtil;
import com.pinnoocle.fruitindustryoptimization.widget.GlideCircleTransform;
import com.pinnoocle.fruitindustryoptimization.widget.GlideEngine;
import com.pinnoocle.fruitindustryoptimization.widget.RoundImageView;
import com.tbruyelle.rxpermissions3.RxPermissions;
import com.timmy.tdialog.TDialog;
import com.timmy.tdialog.base.BindViewHolder;
import com.timmy.tdialog.listener.OnBindViewListener;
import com.timmy.tdialog.listener.OnViewClickListener;

import org.greenrobot.eventbus.EventBus;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

import static com.bumptech.glide.request.RequestOptions.bitmapTransform;

public class SettingActivity extends BaseActivity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.iv_right)
    ImageView ivRight;
    @BindView(R.id.iv_avatar)
    RoundImageView ivAvatar;
    @BindView(R.id.rl_modify_phone)
    RelativeLayout rlModifyPhone;
    @BindView(R.id.iv_right1)
    ImageView ivRight1;
    @BindView(R.id.tv_nick_name)
    TextView tvNickName;
    @BindView(R.id.rl_nick_name)
    RelativeLayout rlNickName;
    @BindView(R.id.iv_right2)
    ImageView ivRight2;
    @BindView(R.id.tv_phone)
    TextView tvPhone;
    @BindView(R.id.rl_phone)
    RelativeLayout rlPhone;
    private DataRepository dataRepository;
    private EditText ed_name;
    private UserInfoDetailModel userInfoDetailModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StatusBarUtil.setColor(this.getWindow(), 0xffF6F6F6);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ButterKnife.bind(this);

        dataRepository = Injection.dataRepository(this);
        userDetail();
    }

    private void userDetail() {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("s", "/api/user/detail");
        map.put("wxapp_id", "10001");
        map.put("token", FastData.getToken());
        dataRepository.userInfoDetail(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(mContext);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(mContext);
                userInfoDetailModel = (UserInfoDetailModel) data;
                if (userInfoDetailModel.getCode() == 1) {
                    Glide.with(SettingActivity.this).load(userInfoDetailModel.getData().getUserInfo().getAvatarUrl()).apply(bitmapTransform(new GlideCircleTransform(SettingActivity.this))).into(ivAvatar);
                    tvNickName.setText(userInfoDetailModel.getData().getUserInfo().getNickName());
                    if (!TextUtils.isEmpty(userInfoDetailModel.getData().getUserInfo().getPhone()) && userInfoDetailModel.getData().getUserInfo().getPhone().length() > 6) {
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < userInfoDetailModel.getData().getUserInfo().getPhone().length(); i++) {
                            char c = userInfoDetailModel.getData().getUserInfo().getPhone().charAt(i);
                            if (i >= 3 && i <= 6) {
                                sb.append('*');
                            } else {
                                sb.append(c);
                            }
                        }
                        tvPhone.setText(sb.toString());
                    }
                }
            }
        });
    }

    @OnClick({R.id.iv_back, R.id.rl_modify_phone, R.id.rl_nick_name, R.id.rl_phone})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.rl_modify_phone:
                rxPermissionTest();
                break;
            case R.id.rl_nick_name:
                new TDialog.Builder(getSupportFragmentManager())
                        .setLayoutRes(R.layout.dialog_one)
                        .setScreenWidthAspect(this, 0.7f)
                        .setGravity(Gravity.CENTER)
                        .setCancelableOutside(false)
                        .addOnClickListener(R.id.tv_cancel, R.id.tv_sure)
                        .setOnBindViewListener(new OnBindViewListener() {
                            @Override
                            public void bindView(BindViewHolder viewHolder) {
                                ed_name = viewHolder.itemView.findViewById(R.id.ed_name);
                            }
                        })
                        .setOnViewClickListener(new OnViewClickListener() {
                            @Override
                            public void onViewClick(BindViewHolder viewHolder, View view, TDialog tDialog) {
                                switch (view.getId()) {
                                    case R.id.tv_cancel:
                                        tDialog.dismiss();
                                        break;
                                    case R.id.tv_sure:
                                        tDialog.dismiss();
                                        modify1(ed_name.getText().toString());
                                        break;
                                }
                            }
                        })
                        .create()
                        .show();
                break;
            case R.id.rl_phone:
                Intent intent = new Intent(this, ModifyPhoneActivity.class);
                intent.putExtra("phone", userInfoDetailModel.getData().getUserInfo().getPhone());
                startActivity(intent);
                break;
        }
    }

    private void rxPermissionTest() {
        RxPermissions rxPermissions = new RxPermissions(this);
        rxPermissions.request(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE)
                .subscribe(granted -> {
                    if (granted) {
                        showCustomDialog();
                    } else {
                        // Oups permission denied
                    }
                });
    }

    private void showCustomDialog() {
        final List<String> names = new ArrayList<>();
        names.add("拍照");
        names.add("相册");
        showDialog(new CustomSelectDialog.SelectDialogListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                if (position == 0) {
                    openCamera();
                } else {
                    openAlbum();
                }
            }
        }, names);
    }

    private void openCamera() {
        PictureSelector.create(this)
                .openCamera(PictureMimeType.ofImage())
                .enableCrop(true)
                .compress(true)
                .forResult(PictureConfig.REQUEST_CAMERA);
    }

    private void openAlbum() {
        PictureSelector.create(this)
                .openGallery(PictureMimeType.ofImage())
                .selectionMode(PictureConfig.SINGLE)
                .loadImageEngine(GlideEngine.createGlideEngine())
                .enableCrop(true)
                .compress(true)
                .forResult(PictureConfig.CHOOSE_REQUEST);
    }

    private CustomSelectDialog showDialog(CustomSelectDialog.SelectDialogListener listener,
                                          List<String> names) {
        CustomSelectDialog dialog = new CustomSelectDialog(this,
                R.style.transparentFrameWindowStyle, listener, names);
        dialog.setItemColor(R.color.black, R.color.black);
        //判断activity是否finish
        if (!this.isFinishing()) {
            dialog.show();
        }
        return dialog;
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        List<LocalMedia> selectList = PictureSelector.obtainMultipleResult(data);
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case PictureConfig.REQUEST_CAMERA:
                    for (LocalMedia localMedia : selectList) {
                        String compressPath = localMedia.getCompressPath();
                        File file = new File(compressPath);
                        modify(file);
                    }
                    break;
                case PictureConfig.CHOOSE_REQUEST:
                    for (LocalMedia localMedia : selectList) {
                        String compressPath = localMedia.getCompressPath();
                        File file = new File(compressPath);
                        modify(file);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    private void modify1(String name) {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("s", "/api/user/modify");
        map.put("wxapp_id", "10001");
        map.put("token", FastData.getToken());
        map.put("nickName", name);
        dataRepository.modify1(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(mContext);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(mContext);
                StatusModel imageModel = (StatusModel) data;
                if (imageModel.getCode() == 1) {
                    tvNickName.setText(name);
                    ToastUtils.showToast(imageModel.getData());
                    EventBus.getDefault().post("1");
                } else {
                    ToastUtils.showToast(imageModel.getMsg());
                }
            }
        });
    }

    private void modify(File file) {
        ViewLoading.show(this);
        RequestBody fileBody = RequestBody.create(MediaType.parse("image/png"), file);
        MultipartBody.Part body =
                MultipartBody.Part.createFormData("iFile", file.getName(), fileBody);
        dataRepository.modify("/api/user/modify", tvNickName.getText().toString(), "10001", FastData.getToken(), body, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(mContext);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(mContext);
                StatusModel imageModel = (StatusModel) data;
                if (imageModel.getCode() == 1) {
                    Glide.with(SettingActivity.this).load(file).apply(bitmapTransform(new GlideCircleTransform(SettingActivity.this))).into(ivAvatar);
                    ToastUtils.showToast(imageModel.getData());
                    EventBus.getDefault().post("1");
                } else {
                    ToastUtils.showToast(imageModel.getMsg());
                }
            }
        });
    }
}