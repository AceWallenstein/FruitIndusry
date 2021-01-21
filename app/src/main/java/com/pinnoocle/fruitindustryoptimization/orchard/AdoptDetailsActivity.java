package com.pinnoocle.fruitindustryoptimization.orchard;

import android.os.Bundle;

import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.common.BaseActivity;

public class AdoptDetailsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopt_details);
    }
}