package com.pinnoocle.fruitindustryoptimization.orchard;

import com.bumptech.glide.Glide;
import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.common.BaseFragment;
import com.pinnoocle.fruitindustryoptimization.home.VideoActivity;
import com.pinnoocle.fruitindustryoptimization.utils.ActivityUtils;

import butterknife.BindView;
import cn.jzvd.Jzvd;
import cn.jzvd.JzvdStd;

public class BannerVideoFragment extends BaseFragment {
    @BindView(R.id.jz_video)
    JzvdStd jzVideo;

    @Override
    protected int LayoutId() {
        return R.layout.fragment_banner_video;
    }

    @Override
    protected void initView() {
        initJzVideo();
    }

    @Override
    public void onResume() {
        jzVideo.startVideo();
        super.onResume();
    }

    private void initJzVideo() {
        jzVideo.setUp("http://1251316161.vod2.myqcloud.com/5f6ddb64vodsh1251316161/ece2c7df5285890812999168943/mKHguCyn6gIA.mp4"
                , "饺子闭眼睛");
        Glide.with(getContext())
                .load("http://p.qpic.cn/videoyun/0/2449_43b6f696980311e59ed467f22794e792_1/640")
                .into(jzVideo.posterImageView);
        jzVideo.fullscreenButton.setOnClickListener(v -> {
            ActivityUtils.startActivity(getContext(), VideoActivity.class);
        });

    }

    @Override
    public void onPause() {
        super.onPause();
        Jzvd.releaseAllVideos();
    }

    public void onBackPressed() {
        if (jzVideo.backPress()) {
            return;
        }
    }
}
