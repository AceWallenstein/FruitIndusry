package com.pinnoocle.fruitindustryoptimization.home;

import android.os.Bundle;

import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.common.BaseActivity;

import butterknife.ButterKnife;

public class SearchActivity extends BaseActivity {

    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);
        initView();

    }

    private void initView() {

    }

}
