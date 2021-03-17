package com.pinnoocle.fruitindustryoptimization.bean;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.pinnoocle.fruitindustryoptimization.adapter.RawStringJsonAdapter;

public class StatusModel {
    /**
     * code : 1
     * msg : success
     * data : 发送成功
     */

    private int code;
    private String msg;
    @SerializedName("data")
    @JsonAdapter(RawStringJsonAdapter.class)
    private String data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
