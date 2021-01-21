package com.pinnoocle.fruitindustryoptimization.orchard;

import android.os.Bundle;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.common.BaseActivity;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;
import com.youth.banner.listener.OnPageChangeListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class AdoptDetailsActivity extends BaseActivity implements OnPageChangeListener {

    private List<String> bannerList;
    @BindView(R.id.goods_banner)
    Banner banner;
    @BindView(R.id.banner_indicator)
    TextView bannerIndicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopt_details);
    }


    private void initBanner(List<String> album) {
        bannerList = new ArrayList<>();
        bannerList = album;
        banner.isAutoLoop(false)
                .setAdapter(new BannerImageAdapter<String>(bannerList) {
                    @Override
                    public void onBindView(BannerImageHolder holder, String data, int position, int size) {
                        //图片加载自己实现
                        Glide.with(holder.itemView)
                                .load(data)
                                .apply(RequestOptions.bitmapTransform(new RoundedCorners(30)))
                                .into(holder.imageView);
                    }
                })
                .isAutoLoop(false)
                .addOnPageChangeListener(this);
        bannerIndicator.setText("1/" + bannerList.size());
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        int realposition = position + 1;
        bannerIndicator.setText(realposition + "/" + bannerList.size());
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}