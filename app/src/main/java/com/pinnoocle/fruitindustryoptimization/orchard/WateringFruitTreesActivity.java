package com.pinnoocle.fruitindustryoptimization.orchard;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;
import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.common.BaseActivity;
import com.pinnoocle.fruitindustryoptimization.widget.GlideCircleTransform;
import com.pinnoocle.fruitindustryoptimization.widget.SpringScaleInterpolator;
import com.pinnoocle.fruitindustryoptimization.widget.StrokeTextView1;
import com.timmy.tdialog.TDialog;
import com.timmy.tdialog.base.BindViewHolder;
import com.timmy.tdialog.listener.OnBindViewListener;
import com.timmy.tdialog.listener.OnViewClickListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.bumptech.glide.request.RequestOptions.bitmapTransform;

public class WateringFruitTreesActivity extends BaseActivity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.iv_avatar)
    ImageView ivAvatar;
    @BindView(R.id.rl_logo)
    RelativeLayout rlLogo;
    @BindView(R.id.iv_maturity_cycle)
    ImageView ivMaturityCycle;
    @BindView(R.id.ll_calendar)
    LinearLayout llCalendar;
    @BindView(R.id.ll_big)
    LinearLayout llBig;
    @BindView(R.id.iv_cloud)
    ImageView ivCloud;
    @BindView(R.id.iv_wish)
    ImageView ivWish;
    @BindView(R.id.tv_time)
    StrokeTextView1 tvTime;
    @BindView(R.id.tv_name)
    StrokeTextView1 tvName;
    @BindView(R.id.rl_big_gift_bag)
    RelativeLayout rlBigGiftBag;
    @BindView(R.id.ll_watering)
    RelativeLayout llWatering;
    @BindView(R.id.rl_tree)
    RelativeLayout rlTree;
    @BindView(R.id.iv_kettle)
    ImageView ivKettle;
    @BindView(R.id.iv_water_drop)
    ImageView ivWaterDrop;
    @BindView(R.id.iv_water_drop1)
    ImageView ivWaterDrop1;
    @BindView(R.id.iv_water_drop2)
    ImageView ivWaterDrop2;
    @BindView(R.id.iv_tree)
    ImageView ivTree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initGreen();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watering_fruit_trees);
        ButterKnife.bind(this);

        Glide.with(this).load(R.drawable.b).apply(bitmapTransform(new GlideCircleTransform(this))).into(ivAvatar);
    }

    @OnClick({R.id.iv_back, R.id.iv_wish, R.id.rl_big_gift_bag, R.id.ll_watering,R.id.rl_tree})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.iv_wish:
                new TDialog.Builder(getSupportFragmentManager())
                        .setLayoutRes(R.layout.dialog_wish)
                        .setScreenWidthAspect(WateringFruitTreesActivity.this, 0.7f)
                        .setGravity(Gravity.CENTER)
                        .setCancelableOutside(false)
                        .addOnClickListener()
                        .setOnBindViewListener(new OnBindViewListener() {
                            @Override
                            public void bindView(BindViewHolder viewHolder) {

                            }
                        })
                        .setOnViewClickListener(new OnViewClickListener() {
                            @Override
                            public void onViewClick(BindViewHolder viewHolder, View view, TDialog tDialog) {
                                switch (view.getId()) {

                                }
                            }
                        })
                        .create()
                        .show();
                break;
            case R.id.rl_big_gift_bag:
                Intent intent = new Intent(this, BigGiftBagActivity.class);
                startActivity(intent);
                break;
            case R.id.ll_watering:
                Animation operatingAnim = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
                LinearInterpolator lin = new LinearInterpolator();
                operatingAnim.setInterpolator(lin);
                operatingAnim.setFillAfter(true);
                operatingAnim.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        Animation animation1 = new AlphaAnimation(0f, 1.0f);
                        animation1.setDuration(800);//动画的持续的时间
                        animation1.setRepeatCount(1);
                        ivWaterDrop.startAnimation(animation1);

                        Animation animation2 = new AlphaAnimation(0f, 1.0f);
                        animation2.setDuration(800);//动画的持续的时间
                        animation2.setRepeatCount(1);
                        ivWaterDrop1.startAnimation(animation2);

                        Animation animation3 = new AlphaAnimation(0f, 1.0f);
                        animation3.setDuration(800);//动画的持续的时间
                        animation3.setRepeatCount(1);
                        ivWaterDrop2.startAnimation(animation3);
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Animation operatingAnim = AnimationUtils.loadAnimation(WateringFruitTreesActivity.this, R.anim.rotate_anim_one);
                        LinearInterpolator lin = new LinearInterpolator();
                        operatingAnim.setInterpolator(lin);
                        operatingAnim.setFillAfter(true);
                        operatingAnim.setAnimationListener(new Animation.AnimationListener() {
                            @Override
                            public void onAnimationStart(Animation animation) {
                            }

                            @Override
                            public void onAnimationEnd(Animation animation) {
                                Animation animation1 = new AlphaAnimation(1.0f, 0f);
                                animation1.setDuration(1000);//动画的持续的时间
                                animation1.setFillAfter(true);
                                ivKettle.startAnimation(animation1);
                            }

                            @Override
                            public void onAnimationRepeat(Animation animation) {
                            }
                        });
                        ivKettle.startAnimation(operatingAnim);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                ivKettle.startAnimation(operatingAnim);
                break;
            case R.id.rl_tree:
                ScaleAnimation sa = new ScaleAnimation(1f, 1.0f, 1.0f, 1.1f, ScaleAnimation.RELATIVE_TO_SELF, 0.0f, ScaleAnimation.RELATIVE_TO_SELF, 1.0f);
                // 设置动画播放的时间
                sa.setDuration(1000);
                sa.setFillAfter(true);
                sa.setInterpolator(new SpringScaleInterpolator(0.3f));
                sa.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        ScaleAnimation sa = new ScaleAnimation(1f, 1.0f, 1.1f, 1.0f, ScaleAnimation.RELATIVE_TO_SELF, 0.0f, ScaleAnimation.RELATIVE_TO_SELF, 1.0f);
                        // 设置动画播放的时间
                        sa.setDuration(500);
                        sa.setFillAfter(true);
                        rlTree.startAnimation(sa);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                rlTree.startAnimation(sa);
                break;
        }
    }
}