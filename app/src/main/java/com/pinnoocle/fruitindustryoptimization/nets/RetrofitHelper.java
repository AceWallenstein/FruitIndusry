package com.pinnoocle.fruitindustryoptimization.nets;

import android.content.Context;
import android.util.Log;

import com.google.gson.GsonBuilder;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.fruitindustryoptimization.BuildConfig;

import java.io.IOException;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.logging.HttpLoggingInterceptor;
import okio.Buffer;
import okio.BufferedSource;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by whs on 2017/2/17
 * Retrofit 初始化
 */


public class RetrofitHelper {
    private Context mContext;

    public NetworkMonitor networkMonitor;
    GsonConverterFactory factory = GsonConverterFactory.create(new GsonBuilder().create());
    private static RetrofitHelper instance = null;
    private Retrofit mRetrofit = null;

    public static RetrofitHelper getInstance(Context context) {
        if (instance == null) {
            instance = new RetrofitHelper(context);

        }
        return instance;
    }

    private RetrofitHelper(Context mContext) {
        this.mContext = mContext;
        networkMonitor = new LiveNetworkMonitor(mContext);
        init();
    }

    private void init() {
        resetApp();
    }

    private void resetApp() {
        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
        okHttpClientBuilder.addNetworkInterceptor(new MyNetworkInterceptor());
        okHttpClientBuilder.addInterceptor(new UrlInterceptor());
        //5秒超时
        okHttpClientBuilder.connectTimeout(20, TimeUnit.SECONDS);

        mRetrofit = new Retrofit.Builder()
                .baseUrl("http://btys.vshop365.cn/")
                .client(client().build())
                //.addConverterFactory(SimpleXmlConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    public static OkHttpClient.Builder client() {

        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();

        httpClientBuilder.connectTimeout(30, TimeUnit.SECONDS);
        httpClientBuilder.writeTimeout(30, TimeUnit.SECONDS);
        httpClientBuilder.readTimeout(30, TimeUnit.SECONDS);
        httpClientBuilder.proxy(Proxy.NO_PROXY);

        httpClientBuilder.networkInterceptors()
                .add(chain -> {
                    Request.Builder req = chain.request().newBuilder();
                    req.addHeader("Accept-Charset", "utf-8")
                            .addHeader("Connection", "keep-alive")
                            .addHeader("Accept", "*/*")
                            .addHeader("x-version", BuildConfig.VERSION_NAME);

                    Response response = chain.proceed(req.build());
                    return response.newBuilder().build();
                });
        httpClientBuilder.addInterceptor(
                new HttpLoggingInterceptor().setLevel(
                        HttpLoggingInterceptor.Level.BODY
                )
        );

        httpClientBuilder.addNetworkInterceptor(chain -> {
            /*
             * 接口字段返回 拦截器
             * */
            Charset UTF8 = Charset.forName("UTF-8");
            Response response = chain.proceed(chain.request());
            ResponseBody responseBody = response.body();
            Log.d("response", response.toString());
            String resultsBody = null;
            if (HttpHeaders.hasBody(response)) {
                BufferedSource source = responseBody.source();
                source.request(Long.MAX_VALUE); // Buffer the entire body.
                Buffer buffer = source.buffer();

                Charset charset = UTF8;
                MediaType contentType = responseBody.contentType();
                if (contentType != null) {
                    try {
                        charset = contentType.charset(UTF8);
                    } catch (UnsupportedCharsetException e) {
                        e.printStackTrace();
                    }
                }
                resultsBody = buffer.clone().readString(charset);
            }

//            try {
//                if(resultsBody!=null&&!TextUtils.isEmpty(resultsBody)) {
//                    Gson gson = new Gson();
//                    RequestLoginBean requestLoginBean = gson.fromJson(resultsBody, RequestLoginBean.class);
//
//                    if (!requestLoginBean.isLogin()) {
//                        if (FastDataUtil.getToken() != null && !TextUtils.isEmpty(FastDataUtil.getToken())) {
//                            FastDataUtil.setToken("");
//                            EventBus.getDefault().post(new FinishEvent());
//                            LoginActivity.open(StaffApplication.getInstanse());
//                        }
//                    }
//
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }


            return response;
        });

        return httpClientBuilder;
    }

    private class MyNetworkInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            if (networkMonitor.isConnected()) {
                Log.d("requestUrl", chain.request().url().toString());
                return chain.proceed(chain.request());
            } else {
                //throw new NoNetworkException();
                ToastUtils.showToast("无网络连接，请检查网络");
            }
            return null;
        }
    }

    private class UrlInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Log.i("requestUrl", chain.request().url().toString());
            return chain.proceed(chain.request());
        }
    }

    /**
     * 常规接口
     *
     * @return
     */
    public RetrofitService getServer() {
        return mRetrofit.create(RetrofitService.class);
    }

}
