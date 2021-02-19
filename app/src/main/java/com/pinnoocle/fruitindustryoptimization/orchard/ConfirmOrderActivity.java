package com.pinnoocle.fruitindustryoptimization.orchard;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.common.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ConfirmOrderActivity extends BaseActivity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.iv_image)
    ImageView ivImage;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.rl_shop_delete)
    RelativeLayout rlShopDelete;
    @BindView(R.id.et_shop_num)
    EditText etShopNum;
    @BindView(R.id.rl_shop_insert)
    RelativeLayout rlShopInsert;
    @BindView(R.id.iv_right)
    ImageView ivRight;
    @BindView(R.id.iv_location)
    ImageView ivLocation;
    @BindView(R.id.iv_right1)
    ImageView ivRight1;
    @BindView(R.id.tv_phone)
    TextView tvPhone;
    @BindView(R.id.tv_adoption_agreement)
    TextView tvAdoptionAgreement;
    @BindView(R.id.tv_buy)
    TextView tvBuy;
    @BindView(R.id.rl_buy)
    RelativeLayout rlBuy;
    @BindView(R.id.tv_authorized_phone)
    TextView tvAuthorizedPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order);
        ButterKnife.bind(this);
        final String linkWord1 = "《认养协议》";
        String word = "我已阅读并同意" + linkWord1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(word);
        int index1 = word.indexOf(linkWord1);
        spannableStringBuilder.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                ToastUtils.showToast("暂无认养协议");
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(0xffDA251D);       //设置文件颜色
                ds.setUnderlineText(false);
            }
        }, index1, index1 + linkWord1.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tvAdoptionAgreement.setText(spannableStringBuilder);
        tvAdoptionAgreement.setMovementMethod(LinkMovementMethod.getInstance());
        tvAdoptionAgreement.setHighlightColor(getResources().getColor(R.color.transparent));
    }

    @OnClick({R.id.iv_back, R.id.tv_buy})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_buy:
                Intent intent = new Intent(this, ECertActivity.class);
                startActivity(intent);
                break;
        }
    }
}