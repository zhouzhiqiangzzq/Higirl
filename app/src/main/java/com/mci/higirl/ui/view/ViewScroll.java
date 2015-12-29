package com.mci.higirl.ui.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.ScrollView;

/**
 * Created by Administrator on 2015/12/29.
 */
public class ViewScroll extends ScrollView {
    public ViewScroll(Context context) {
        super(context);
    }

    public ViewScroll(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewScroll(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        new ListView(context);
        new GridView(context);
        new GridLayout(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ViewScroll(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
