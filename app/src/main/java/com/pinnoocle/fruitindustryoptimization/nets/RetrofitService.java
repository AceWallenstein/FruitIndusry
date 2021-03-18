package com.pinnoocle.fruitindustryoptimization.nets;

import com.pinnoocle.fruitindustryoptimization.bean.ImageModel;
import com.pinnoocle.fruitindustryoptimization.bean.StatusModel;
import com.pinnoocle.fruitindustryoptimization.bean.UserInfoDetailModel;
import com.pinnoocle.fruitindustryoptimization.bean.UserInfoModel;

import java.util.Map;

import okhttp3.MultipartBody;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;
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

    // 个人中心
    @POST("index.php")
    Observable<UserInfoModel> userInfo(@QueryMap Map<String, String> queryMap);

    // 用户信息
    @POST("index.php")
    Observable<UserInfoDetailModel> userInfoDetail(@QueryMap Map<String, String> queryMap);

    //上传图片
    @Multipart
    @POST("index.php")
    Observable<StatusModel> modify(@Query("s") String s, @Query("nickName") String nickName, @Query("wxapp_id") String wxappid, @Query("token") String token, @Part MultipartBody.Part file);

    //修改昵称
    @POST("index.php?s=/api/user/modify&wxapp_id=10001")
    Observable<StatusModel> modify1(@Body Map<String, String> queryMap);

}
