package com.mci.higirl;

import com.mci.higirl.model.HApi;
import com.orhanobut.logger.AndroidLogTool;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.logging.HttpLoggingInterceptor;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by Administrator on 2015/12/22.
 */
public class ConfigInstance {
    private static ConfigInstance sInstance;
    private Retrofit mRetrofit;
    private HApi mHApiService;

    private ConfigInstance() {
        OkHttpClient client = new OkHttpClient();
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        client.interceptors().add(interceptor);

        mRetrofit = new Retrofit.Builder()
                .baseUrl(Config.HTTP_HOST)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        mHApiService = mRetrofit.create(HApi.class);

        Logger.init("ConfigInstance").methodCount(0).hideThreadInfo().logLevel(LogLevel.FULL)        // default LogLevel.FULL
                .methodOffset(2)                // default 0
                .logTool(new AndroidLogTool());
    }

    public static ConfigInstance getInstance() {
        if (sInstance == null) {
            sInstance = new ConfigInstance();
        }
        return sInstance;
    }

    public Retrofit getRetrofit() {
        return mRetrofit;
    }

    public HApi getHApiService() {
        return mHApiService;
    }

}
