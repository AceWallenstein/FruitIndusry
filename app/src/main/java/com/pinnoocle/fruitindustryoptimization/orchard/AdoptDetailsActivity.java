package com.pinnoocle.fruitindustryoptimization.orchard;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.common.BaseActivity;
import com.pinnoocle.fruitindustryoptimization.widget.SwitchView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdoptDetailsActivity extends BaseActivity {


    @BindView(R.id.fl_banner)
    FrameLayout flBanner;
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.tv_adopt)
    TextView tvAdopt;
    @BindView(R.id.switchView)
    SwitchView switchView;
    private List<Fragment> mList = new ArrayList<>();
    private BannerImageFragment bannerImageFragment;
    private BannerVideoFragment bannerVideoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopt_details);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        bannerImageFragment = new BannerImageFragment();
        bannerVideoFragment = new BannerVideoFragment();
        mList.add(bannerImageFragment);
        mList.add(bannerVideoFragment);
        switchFragment(mList.get(0));

        switchView.setOnClickCheckedListener(new SwitchView.onClickCheckedListener() {
            @Override
            public void onClick() {
                if (switchView.isChecked()) {
                    switchFragment(mList.get(1));
                }else {
                    switchFragment(mList.get(0));
                }
            }
        });
    }

    private void switchFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_banner, fragment).commitAllowingStateLoss();
    }

    @Override
    public void onBackPressed() {
        if (bannerVideoFragment != null) {
            bannerVideoFragment.onBackPressed();
        }
        super.onBackPressed();

    }
}