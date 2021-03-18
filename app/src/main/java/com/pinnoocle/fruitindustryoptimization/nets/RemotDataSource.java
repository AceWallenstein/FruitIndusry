package com.pinnoocle.fruitindustryoptimization.nets;


import java.util.Map;

import okhttp3.MultipartBody;

/**
 * Created by whs on 2017/6/7
 */

public interface RemotDataSource {
    interface getCallback {

        void onFailure(String info);

        void onSuccess(Object data);
    }

    void login(Map<String, String> queryMap, getCallback callback);

    void sms(Map<String, String> queryMap, getCallback callback);

    void userInfo(Map<String, String> queryMap, getCallback callback);

    void userInfoDetail(Map<String, String> queryMap, getCallback callback);

    void modify(String s, String nickName, String wxappid, String token, MultipartBody.Part file, getCallback callback);

    void modify1(Map<String, String> queryMap, getCallback callback);
}
