package com.pinnoocle.fruitindustryoptimization.nets;

import android.content.Context;

import java.util.Map;

import okhttp3.MultipartBody;

/**
 * Created by whs on 2017/5/18
 */

public class DataRepository implements RemotDataSource {
    private Context mContext;

    private static DataRepository INSTANCE = null;


    private final RemotDataSourceImpl mRemoteDataSource;

    public static DataRepository getInstance(RemotDataSourceImpl remoteDataSource) {
        if (INSTANCE == null) {
            INSTANCE = new DataRepository(remoteDataSource);
        }
        return INSTANCE;
    }

    private DataRepository(RemotDataSourceImpl remoteDataSource) {
        //this.mContext=context;
        this.mRemoteDataSource = remoteDataSource;
    }

    @Override
    public void login(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.login(queryMap, callback);
    }

    @Override
    public void sms(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.sms(queryMap, callback);
    }

    @Override
    public void userInfo(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.userInfo(queryMap, callback);
    }

    @Override
    public void userInfoDetail(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.userInfoDetail(queryMap, callback);
    }

    @Override
    public void modify(String s, String nickName, String wxappid, String token, MultipartBody.Part file, getCallback callback) {
        mRemoteDataSource.modify(s, nickName, wxappid, token, file, callback);
    }

    @Override
    public void modify1(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.modify1(queryMap, callback);
    }

}
