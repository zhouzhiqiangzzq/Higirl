package com.mci.higirl.ui.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import com.orhanobut.logger.Logger;

/**
 * Created by Administrator on 2015/12/24.
 */
public class TestLinearLayout extends LinearLayout {
    public TestLinearLayout(Context context) {
        super(context);
    }

    public TestLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TestLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public TestLinearLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.v("ListenerActivity", "TestLinearLayout onInterceptTouchEvent-- action=" + ev.getAction());
        if (ev.getAction() == MotionEvent.ACTION_MOVE) {
            return true;
        } else {
            return super.onInterceptTouchEvent(ev);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.v("ListenerActivity", "TestLinearLayout dispatchTouchEvent-- action=" + event.getAction()+ "  "+ super.getClass());
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.v("ListenerActivity", "TestLinearLayout onTouchEvent-- action=" + event.getAction());
        return super.onTouchEvent(event);
    }
}
