package com.pinnoocle.fruitindustryoptimization.home;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.core.widget.NestedScrollView;

import com.bumptech.glide.Glide;
import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.common.BaseFragment;
import com.pinnoocle.fruitindustryoptimization.utils.ActivityUtils;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.sunfusheng.marqueeview.MarqueeView;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;
import cn.jzvd.Jzvd;
import cn.jzvd.JzvdStd;

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
    @BindView(R.id.marqueeView)
    MarqueeView marqueeView;
    @BindView(R.id.ll_marqueeView)
    LinearLayout llMarqueeView;
    @BindView(R.id.jz_video)
    JzvdStd jzVideo;

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
        initJzVideo();
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
    private void initJzVideo() {
        jzVideo.setUp("http://1251316161.vod2.myqcloud.com/5f6ddb64vodsh1251316161/ece2c7df5285890812999168943/mKHguCyn6gIA.mp4"
                , "饺子闭眼睛");
        Glide.with(getContext())
                .load("http://p.qpic.cn/videoyun/0/2449_43b6f696980311e59ed467f22794e792_1/640")
                .into(jzVideo.posterImageView);
        jzVideo.fullscreenButton.setOnClickListener(v -> {
            ActivityUtils.startActivity(getContext(),VideoActivity.class);
        });

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
        ActivityUtils.startActivity(getContext(), SearchActivity.class);
    }

    @Override
    public void onPause() {
        super.onPause();
        Jzvd.releaseAllVideos();
    }

    public void onBackPressed() {
        if (jzVideo.backPress()) {
            return ;
        }
    }
}
