package com.mci.higirl.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.orhanobut.logger.AndroidLogTool;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

/**
 * Created by Administrator on 2015/12/28.
 */
public class MyService extends Service {

    private MyBinder mMyBinder = new MyBinder();

    @Override
    public void onCreate() {
        Logger.d("MyService---------------->> onCreate()");
        super.onCreate();
    }

    //api 5被废弃
    @Override
    public void onStart(Intent intent, int startId) {
        Logger.d("MyService---------------->> onStart()");
        super.onStart(intent, startId);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Logger.d("MyService---------------->> onStartCommand()");
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Logger.d("MyService---------------->> onBind()");
        return mMyBinder;
    }

    @Override
    public void onRebind(Intent intent) {
        Logger.d("MyService---------------->> onRebind()");
        super.onRebind(intent);
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Logger.d("MyService---------------->> onUnbind()");
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        Logger.d("MyService---------------->> onDestroy()");
        super.onDestroy();
    }

    public class MyBinder extends Binder {
        public void startDownload() {
            Logger.d("MyService---------------->> MyBinder              startDownload()");
        }

    }
}
