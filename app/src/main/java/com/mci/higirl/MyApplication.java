package com.mci.higirl;

import android.app.Application;

/**
 * Created by Administrator on 2015/12/28.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ConfigInstance.getInstance();
    }
}
