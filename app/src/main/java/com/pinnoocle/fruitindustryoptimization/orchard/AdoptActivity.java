package com.pinnoocle.fruitindustryoptimization.orchard;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.adapter.AdoptAdapter;
import com.pinnoocle.fruitindustryoptimization.common.BaseActivity;
import com.pinnoocle.fruitindustryoptimization.utils.ActivityUtils;
import com.pinnoocle.fruitindustryoptimization.widget.CommItemDecoration;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AdoptActivity extends BaseActivity implements AdoptAdapter.OnItemClickListener {

    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.recycleView)
    RecyclerView recycleView;
    @BindView(R.id.refresh)
    SmartRefreshLayout refresh;
    AdoptAdapter adoptAdapter;
    @BindView(R.id.iv_back)
    ImageView ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopt);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        recycleView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recycleView.addItemDecoration(new CommItemDecoration(this, DividerItemDecoration.VERTICAL, getResources().getColor(R.color.transparent), 30));
        adoptAdapter = new AdoptAdapter(this);
        recycleView.setAdapter(adoptAdapter);

        adoptAdapter.setOnItemClickListener(this);
    }

    @OnClick(R.id.iv_back)
    public void onViewClicked() {
        finish();
    }

    @Override
    public void onItemClick(int position) {
        ActivityUtils.startActivity(this, AdoptDetailsActivity.class);
    }
}