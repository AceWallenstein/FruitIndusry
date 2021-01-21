package com.pinnoocle.fruitindustryoptimization.orchard;

import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.common.BaseFragment;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;
import com.youth.banner.listener.OnPageChangeListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class BannerImageFragment extends BaseFragment implements OnPageChangeListener {
    @BindView(R.id.goods_banner)
    Banner banner;
    @BindView(R.id.banner_indicator)
    TextView bannerIndicator;
    private List<Integer> bannerList = new ArrayList<>();

    @Override
    protected int LayoutId() {
        return R.layout.fragment_banner_image;
    }

    @Override
    protected void initView() {
        bannerList.clear();
        bannerList.add(R.drawable.a);
        initBanner();
    }

    private void initBanner() {
        banner.isAutoLoop(false)
                .setAdapter(new BannerImageAdapter<Integer>(bannerList) {
                    @Override
                    public void onBindView(BannerImageHolder holder, Integer data, int position, int size) {
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
