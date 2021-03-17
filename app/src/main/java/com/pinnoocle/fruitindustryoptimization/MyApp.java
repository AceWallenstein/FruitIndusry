package com.pinnoocle.fruitindustryoptimization;

import android.app.Application;
import android.content.Context;

import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.fruitindustryoptimization.utils.FastData;


public class MyApp extends Application {
    private static Application sContext;

    public static Context getInstance() {
        return sContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
        FastData.getInstance();
        ToastUtils.init(this);
    }
}
