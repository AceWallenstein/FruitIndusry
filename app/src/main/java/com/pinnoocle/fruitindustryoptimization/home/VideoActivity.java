package com.pinnoocle.fruitindustryoptimization.home;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.common.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.jzvd.JZMediaSystem;
import cn.jzvd.JZUtils;
import cn.jzvd.JZUtils;
import cn.jzvd.Jzvd;
import cn.jzvd.JzvdStd;

public class VideoActivity extends BaseActivity {
    @BindView(R.id.jz_video)
    JzvdStd jzVideo;

    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        ButterKnife.bind(this);
        initView();

    }

    private void initView() {
        JZUtils.clearSavedProgress(this,"http://1251316161.vod2.myqcloud.com/5f6ddb64vodsh1251316161/ece2c7df5285890812999168943/mKHguCyn6gIA.mp4");
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams lp = getWindow().getAttributes();
            lp.layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
            getWindow().setAttributes(lp);
        }
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);//设置videoView全屏播放
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//设置videoView横屏播放
        if (this.getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        jzVideo.setUp("http://1251316161.vod2.myqcloud.com/5f6ddb64vodsh1251316161/ece2c7df5285890812999168943/mKHguCyn6gIA.mp4"
                , "饺子闭眼睛",JzvdStd.SCREEN_FULLSCREEN);
        jzVideo.resetProgressAndTime();
        jzVideo.backButton.setOnClickListener(v -> {
            finish();
        });
        jzVideo.startVideo();
    }

    @Override
    public void onBackPressed() {
       finish();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Jzvd.releaseAllVideos();
    }
}
