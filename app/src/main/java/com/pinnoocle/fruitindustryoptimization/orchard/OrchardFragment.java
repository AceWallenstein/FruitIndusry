package com.pinnoocle.fruitindustryoptimization.orchard;

import android.widget.TextView;

import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.common.BaseFragment;
import com.pinnoocle.fruitindustryoptimization.utils.ActivityUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class OrchardFragment extends BaseFragment {
    @BindView(R.id.tv_adopt)
    TextView tvAdopt;

    @Override
    protected int LayoutId() {
        return R.layout.fragment_orchard;
    }


    @OnClick(R.id.tv_adopt)
    public void onViewClicked() {
        ActivityUtils.startActivity(getActivity(), AdoptActivity.class);
    }
}
