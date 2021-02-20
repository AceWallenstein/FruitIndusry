package com.pinnoocle.fruitindustryoptimization.orchard;

import android.content.Intent;
import android.widget.TextView;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.adapter.AdoptAdapter;
import com.pinnoocle.fruitindustryoptimization.adapter.TreeAdapter;
import com.pinnoocle.fruitindustryoptimization.common.BaseFragment;
import com.pinnoocle.fruitindustryoptimization.utils.ActivityUtils;
import com.pinnoocle.fruitindustryoptimization.widget.CommItemDecoration;

import butterknife.BindView;
import butterknife.OnClick;

public class OrchardFragment extends BaseFragment implements TreeAdapter.OnItemClickListener {
    @BindView(R.id.tv_adopt)
    TextView tvAdopt;
    @BindView(R.id.recycleView)
    RecyclerView recycleView;
    private TreeAdapter treeAdapter;

    @Override
    protected int LayoutId() {
        return R.layout.fragment_orchard;
    }

    @Override
    protected void initView() {
        recycleView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recycleView.addItemDecoration(new CommItemDecoration(getActivity(), DividerItemDecoration.VERTICAL, getResources().getColor(R.color.transparent), 30));
        treeAdapter = new TreeAdapter(getActivity());
        recycleView.setAdapter(treeAdapter);

        treeAdapter.setOnItemClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @OnClick(R.id.tv_adopt)
    public void onViewClicked() {
        ActivityUtils.startActivity(getActivity(), AdoptActivity.class);
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(getActivity(), WateringFruitTreesActivity.class);
        startActivity(intent);
    }
}
