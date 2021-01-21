package com.pinnoocle.fruitindustryoptimization;

import android.app.Application;
import android.content.Context;

import com.pedaily.yc.ycdialoglib.toast.ToastUtils;


public class MyApp extends Application {
    private static Application sContext;

    public static Context getInstanse() {
        return sContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
        ToastUtils.init(this);
    }
}
