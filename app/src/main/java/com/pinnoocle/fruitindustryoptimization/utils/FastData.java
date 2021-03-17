package com.pinnoocle.fruitindustryoptimization.utils;

import com.pinnoocle.fruitindustryoptimization.MyApp;

/**
 * Created by WS on 2019/1/4.
 */

public class FastData extends Remember {

    protected static Remember remember = null;

    private static final String SHARED_PREFS_NAME = "btyx";

    public static synchronized Remember getInstance() {
        if (remember == null) {
            remember = init(MyApp.getInstance(), SHARED_PREFS_NAME);
        }
        return remember;
    }

    //token
    public static void setToken(String token) {
        putString("token", token);
    }

    public static String getToken() {
        return getString("token", "");
    }

    //user_id
    public static void setUserId(String userId) {
        putString("userId", userId);
    }

    public static String getUserId() {
        return getString("userId", "");
    }
}