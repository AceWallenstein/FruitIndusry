package com.pinnoocle.fruitindustryoptimization.nets;


import java.util.Map;

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

}
