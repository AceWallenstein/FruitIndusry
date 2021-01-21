package com.pinnoocle.fruitindustryoptimization.home;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.core.widget.NestedScrollView;

import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.common.BaseFragment;
import com.pinnoocle.fruitindustryoptimization.utils.ActivityUtils;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;

public class HomeFragment extends BaseFragment implements AdapterView.OnItemClickListener {
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.ed_search)
    TextView edSearch;
    @BindView(R.id.rl_search)
    RelativeLayout rlSearch;
    @BindView(R.id.banner)
    Banner banner;
    @BindView(R.id.gridView)
    GridView gridView;
    @BindView(R.id.scrollview)
    NestedScrollView scrollview;
    @BindView(R.id.refresh)
    SmartRefreshLayout refresh;

    private ArrayList<Map<String, Object>> data_list;
    private SimpleAdapter sim_adapter;

    private int[] icon = {R.mipmap.fruit_tree, R.mipmap.seckill, R.mipmap.group_buying, R.mipmap.vip_product};

    private String[] iconName = {"果树认养", "秒杀助力", "团购好货", "会员产品"};

    @Override
    protected int LayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView() {
        grid();
        gridView.setOnItemClickListener(this);
    }

    private void grid() {
        data_list = new ArrayList<Map<String, Object>>();
        //获取数据
        getData();
        //新建适配器
        String[] from = {"image", "text"};
        int[] to = {R.id.image, R.id.text};
        sim_adapter = new SimpleAdapter(getContext(), data_list, R.layout.item, from, to);
        //配置适配器
        gridView.setAdapter(sim_adapter);
        gridView.setSelector(new ColorDrawable(Color.TRANSPARENT));

    }

    public List<Map<String, Object>> getData() {
        //cion和iconName的长度是相同的，这里任选其一都可以
        for (int i = 0; i < icon.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", icon[i]);
            map.put("text", iconName[i]);
            data_list.add(map);
        }
        return data_list;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
//            ActivityUtils.startActivity(getContext(),FruitTreeActivity.class);
        } else if (position == 1) {

        } else if (position == 2) {

        } else if (position == 3) {


        }
    }

    @OnClick(R.id.ed_search)
    public void onViewClicked() {
        ActivityUtils.startActivity(getContext(),SearchActivity.class);
    }
}
