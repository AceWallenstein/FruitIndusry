package com.pinnoocle.fruitindustryoptimization.nets;

import com.pinnoocle.fruitindustryoptimization.bean.StatusModel;

import java.util.Map;

import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by whs on 2017/2/17
 * Retrofit 接口
 */

public interface RetrofitService {
    // 登录
    @POST("index.php")
    Observable<StatusModel> login(@QueryMap Map<String, String> queryMap);

    // 登录验证码
    @POST("index.php")
    Observable<StatusModel> sms(@QueryMap Map<String, String> queryMap);
}
