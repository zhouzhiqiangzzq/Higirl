package com.mci.higirl.model.splashlist;

import com.mci.higirl.model.CommonResult;

/**
 * Created by Administrator on 2015/12/18.
 */
public class SplashListResult extends CommonResult {
    public String nextpublishtime;
    public SplashListData result;
    public String servertime;

    public String getNextpublishtime() {
        return nextpublishtime;
    }

    public void setNextpublishtime(String nextpublishtime) {
        this.nextpublishtime = nextpublishtime;
    }

    public String getServertime() {
        return servertime;
    }

    public void setServertime(String servertime) {
        this.servertime = servertime;
    }

    public SplashListData getResult() {
        return result;
    }

    public void setResult(SplashListData result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "SplashListResult{" +
                "nextpublishtime='" + nextpublishtime + '\'' +
                ", result=" + result +
                ", servertime='" + servertime + '\'' +
                '}';
    }
}
