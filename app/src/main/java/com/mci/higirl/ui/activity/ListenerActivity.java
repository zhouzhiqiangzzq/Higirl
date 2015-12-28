package com.mci.higirl.ui.activity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.mci.higirl.R;
import com.mci.higirl.service.MyService;
import com.mci.higirl.ui.view.TestButton;
import com.mci.higirl.ui.view.TestLinearLayout;
import com.orhanobut.logger.Logger;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2015/12/25.
 */
public class ListenerActivity extends Activity implements View.OnTouchListener, View.OnClickListener {
    private TestLinearLayout mLayout;
    private TestButton mButton;

    @Bind(R.id.start_service)
    public Button mStartService;
    @Bind(R.id.bind_service)
    public Button mBindService;
    @Bind(R.id.stop_service)
    public Button mStopService;
    @Bind(R.id.unbind_service)
    public Button mUnBindService;


    private MyService.MyBinder myBinder;

    private ServiceConnection connection = new ServiceConnection() {

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Logger.d("onServiceDisconnected-------------->>>> ");
        }

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Logger.d("onServiceConnected-------------->>>> ");
            myBinder = (MyService.MyBinder) service;
            myBinder.startDownload();
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ButterKnife.bind(this);
//        mLayout = (TestLinearLayout) this.findViewById(R.id.mylayout);
//        mButton = (TestButton) this.findViewById(R.id.my_btn);
//
//        mLayout.setOnTouchListener(this);
//        mButton.setOnTouchListener(this);
//
//        mLayout.setOnClickListener(this);
//        mButton.setOnClickListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Log.v("ListenerActivity", "OnTouchListener--onTouch-- action=" + event.getAction() + " --" + v);
        return false;
    }

    @Override
    public void onClick(View v) {
        Log.v("ListenerActivity", "OnClickListener--onClick--" + v);
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
    }


    @OnClick(R.id.start_service)
    public void startService() {
        Intent startIntent = new Intent(this, MyService.class);
        startService(startIntent);
    }

    @OnClick(R.id.bind_service)
    public void bindService() {
        Intent bindIntent = new Intent(this, MyService.class);
        bindService(bindIntent, connection, BIND_AUTO_CREATE);
    }

    @OnClick(R.id.stop_service)
    public void stopService() {
        Intent stopIntent = new Intent(this, MyService.class);
        stopService(stopIntent);
    }

    @OnClick(R.id.unbind_service)
    public void unBindService() {

        unbindService(connection);
    }


}