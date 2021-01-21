package com.pinnoocle.fruitindustryoptimization.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by 周旭 on 2017/2/6.
 * 底部导航对应的Main ViewPager的适配器
 */

public class MainAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragmentList;

    public MainAdapter(FragmentManager fm, List<Fragment> mFragmentList) {
        super(fm);
        this.mFragmentList = mFragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
