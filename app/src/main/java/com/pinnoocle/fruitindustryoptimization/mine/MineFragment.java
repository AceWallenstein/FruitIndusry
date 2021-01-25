package com.pinnoocle.fruitindustryoptimization.mine;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import com.bumptech.glide.Glide;
import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.common.BaseFragment;
import com.pinnoocle.fruitindustryoptimization.widget.GlideCircleTransform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;

import static com.bumptech.glide.request.RequestOptions.bitmapTransform;

public class MineFragment extends BaseFragment {
    @BindView(R.id.iv_avatar)
    ImageView ivAvatar;
    @BindView(R.id.iv_setting)
    ImageView ivSetting;
    @BindView(R.id.right)
    ImageView right;
    @BindView(R.id.gridView)
    GridView gridView;
    @BindView(R.id.gridView1)
    GridView gridView1;
    private int[] icon = {R.mipmap.paid, R.mipmap.delivered, R.mipmap.received, R.mipmap.evaluated, R.mipmap.after_sales};
    private int[] icon1 = {R.mipmap.membership, R.mipmap.my_fruit_tree, R.mipmap.adoption, R.mipmap.registration};
    private String[] iconName = {"待付款", "待发货", "待收货", "待评价", "退款/售后"};
    private String[] iconName1 = {"会员中心", "我的果树", "邀请认养", "客服"};
    private SimpleAdapter sim_adapter, sim_adapter1;
    private ArrayList<Map<String, Object>> data_list, data_list1;

    @Override
    protected int LayoutId() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initView() {
        Glide.with(this).load(R.drawable.b).apply(bitmapTransform(new GlideCircleTransform(getContext()))).into(ivAvatar);
        grid();
        grid1();
    }

    private void grid1() {
        data_list1 = new ArrayList<Map<String, Object>>();
        //获取数据
        getData1();
        //新建适配器
        String[] from = {"image", "text"};
        int[] to = {R.id.image, R.id.text};
        sim_adapter1 = new SimpleAdapter(getContext(), data_list1, R.layout.item, from, to);
        //配置适配器
        gridView1.setAdapter(sim_adapter1);
        gridView1.setSelector(new ColorDrawable(Color.TRANSPARENT));
    }

    private List<Map<String, Object>> getData1() {
        for (int i = 0; i < icon1.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", icon1[i]);
            map.put("text", iconName1[i]);
            data_list1.add(map);
        }
        return data_list1;
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

    private List<Map<String, Object>> getData() {
        for (int i = 0; i < icon.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", icon[i]);
            map.put("text", iconName[i]);
            data_list.add(map);
        }
        return data_list;
    }
}
