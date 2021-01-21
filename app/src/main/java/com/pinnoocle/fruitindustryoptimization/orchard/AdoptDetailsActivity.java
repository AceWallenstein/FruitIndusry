package com.pinnoocle.fruitindustryoptimization.orchard;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.fragment.app.Fragment;

import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.common.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AdoptDetailsActivity extends BaseActivity {


    @BindView(R.id.fl_banner)
    FrameLayout flBanner;
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
    }


    @OnClick({R.id.tv_1, R.id.tv_2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_1:
                switchFragment(mList.get(0));
                break;
            case R.id.tv_2:
                switchFragment(mList.get(1));
                break;
        }
    }
    private void switchFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_banner,fragment).commitAllowingStateLoss();
    }

    @Override
    public void onBackPressed() {
        if(bannerVideoFragment!=null){
            bannerVideoFragment.onBackPressed();
        }
        super.onBackPressed();

    }
}