package com.mci.higirl.model;

import com.mci.higirl.model.splashlist.SplashListParam;
import com.mci.higirl.model.splashlist.SplashListResult;

import retrofit.Call;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.POST;
import rx.Observable;

/**
 * Created by Administrator on 2015/12/18.
 */
public interface HApi {

    @POST("splash/list")
    Observable<SplashListResult> postSplashList(@Body SplashListParam param);
}
