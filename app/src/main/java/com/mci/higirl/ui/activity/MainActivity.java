package com.mci.higirl.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.mci.higirl.Config;
import com.mci.higirl.ConfigInstance;
import com.mci.higirl.R;
import com.mci.higirl.model.HApi;
import com.mci.higirl.model.splashlist.SplashListData;
import com.mci.higirl.model.splashlist.SplashListParam;
import com.mci.higirl.model.splashlist.SplashListResult;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.logging.HttpLoggingInterceptor;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;
import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.android.schedulers.HandlerScheduler;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class MainActivity extends Activity {

    @Bind(R.id.click)
    Button mButton;
    @Bind(R.id.result)
    TextView mResult;
    @Bind(R.id.img)
    ImageView mImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.init("MainActivity").hideThreadInfo().logLevel(LogLevel.FULL);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Logger.v("" + mButton.isEnabled() + "   " + mButton.isClickable() + "   " + mButton.isLongClickable());
        Logger.v("" + mResult.isEnabled() + "   " + mResult.isClickable() + "   " + mResult.isLongClickable());
        mButton.setText("current task id: " + this.getTaskId() + "  " + this.toString());

        mButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Logger.v("onLongClick");
                return false;
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @OnClick(R.id.result)
    void getData2() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }


    @OnClick(R.id.click)
    void getData() {
        Logger.v("onClick");
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);


//        HApi service = ConfigInstance.getInstance().getHApiService();
//        SplashListParam param = new SplashListParam();
//        param.setDate("0");
//        Observable<SplashListResult> observable = service.postSplashList(param);
//        observable
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .map(new Func1<SplashListResult, SplashListData>() {
//                    @Override
//                    public SplashListData call(SplashListResult splashListResult) {
//                        return splashListResult.getResult();
//                    }
//                })
//                .subscribe(new Subscriber<SplashListData>() {
//                    @Override
//                    public void onCompleted() {
//                        Toast.makeText(getApplicationContext(),
//                                "Completed",
//                                Toast.LENGTH_SHORT)
//                                .show();
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Toast.makeText(getApplicationContext(),
//                                e.getMessage(),
//                                Toast.LENGTH_SHORT)
//                                .show();
//                    }
//
//                    @Override
//                    public void onNext(SplashListData data) {
//                        Logger.d(data.toString());
//                        if (data != null) {
//                            Glide.with(MainActivity.this).load(data.getImage4()).into(mImg);
//                        }
//                        mResult.setText(data.toString());
//                    }
//                });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
