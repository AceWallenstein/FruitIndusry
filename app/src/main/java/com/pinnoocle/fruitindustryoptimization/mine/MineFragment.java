package com.pinnoocle.fruitindustryoptimization.mine;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.pinnoocle.fruitindustryoptimization.R;
import com.pinnoocle.fruitindustryoptimization.bean.UserInfoModel;
import com.pinnoocle.fruitindustryoptimization.common.BaseFragment;
import com.pinnoocle.fruitindustryoptimization.nets.DataRepository;
import com.pinnoocle.fruitindustryoptimization.nets.Injection;
import com.pinnoocle.fruitindustryoptimization.nets.RemotDataSource;
import com.pinnoocle.fruitindustryoptimization.utils.FastData;
import com.pinnoocle.fruitindustryoptimization.widget.GlideCircleTransform;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;

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
    @BindView(R.id.tv_nick_name)
    TextView tvNickName;
    @BindView(R.id.tv_phone)
    TextView tvPhone;
    @BindView(R.id.iv_purchase)
    ImageView ivPurchase;
    @BindView(R.id.iv_second_kill)
    ImageView ivSecondKill;
    @BindView(R.id.iv_tree)
    ImageView ivTree;
    @BindView(R.id.iv_collection)
    ImageView ivCollection;
    @BindView(R.id.iv_location)
    ImageView ivLocation;
    @BindView(R.id.iv_collection1)
    ImageView ivCollection1;
    @BindView(R.id.iv_message)
    ImageView ivMessage;
    private int[] icon = {R.mipmap.paid, R.mipmap.delivered, R.mipmap.received, R.mipmap.evaluated, R.mipmap.after_sales};
    private int[] icon1 = {R.mipmap.membership, R.mipmap.my_fruit_tree, R.mipmap.adoption, R.mipmap.registration};
    private String[] iconName = {"待付款", "待发货", "待收货", "待评价", "退款/售后"};
    private String[] iconName1 = {"会员中心", "我的果树", "邀请认养", "客服"};
    private SimpleAdapter sim_adapter, sim_adapter1;
    private ArrayList<Map<String, Object>> data_list, data_list1;
    private DataRepository dataRepository;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 100, sticky = false) //在ui线程执行，优先级为100
    public void onEvent(String event) {
        if (event.equals("1")) {
            userInfo();
        }
    }

    @Override
    protected int LayoutId() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initView() {
        dataRepository = Injection.dataRepository(getContext());
        grid();
        grid1();
        userInfo();
    }

    private void userInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("s", "/api/user.index/detail");
        map.put("wxapp_id", "10001");
        map.put("token", FastData.getToken());
        dataRepository.userInfo(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
            }

            @Override
            public void onSuccess(Object data) {
                UserInfoModel userInfoModel = (UserInfoModel) data;
                if (userInfoModel.getCode() == 1) {
                    Glide.with(getContext()).load(userInfoModel.getData().getUserInfo().getAvatarUrl()).apply(bitmapTransform(new GlideCircleTransform(getContext()))).into(ivAvatar);
                    tvNickName.setText(userInfoModel.getData().getUserInfo().getNickName());
                    if (!TextUtils.isEmpty(userInfoModel.getData().getUserInfo().getPhone()) && userInfoModel.getData().getUserInfo().getPhone().length() > 6) {
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < userInfoModel.getData().getUserInfo().getPhone().length(); i++) {
                            char c = userInfoModel.getData().getUserInfo().getPhone().charAt(i);
                            if (i >= 3 && i <= 6) {
                                sb.append('*');
                            } else {
                                sb.append(c);
                            }
                        }
                        tvPhone.setText(sb.toString());
                    }
                }
            }
        });
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

    @OnClick(R.id.iv_setting)
    public void onViewClicked() {
        startActivity(new Intent(getContext(), SettingActivity.class));
    }
}
