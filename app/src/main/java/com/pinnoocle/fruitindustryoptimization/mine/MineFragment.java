package com.pinnoocle.fruitindustryoptimization.mine;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.common.BaseFragment;
import com.pinnoocle.fruitindustryoptimization.widget.GlideCircleTransform;

import butterknife.BindView;

import static com.bumptech.glide.request.RequestOptions.bitmapTransform;

public class MineFragment extends BaseFragment {
    @BindView(R.id.iv_avatar)
    ImageView ivAvatar;

    @Override
    protected int LayoutId() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initView() {
        Glide.with(this).load(R.drawable.b).apply(bitmapTransform(new GlideCircleTransform(getContext()))).into(ivAvatar);
    }
}
