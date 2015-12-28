package com.mci.higirl.model;

/**
 * Created by Administrator on 2015/12/18.
 */
public class CommonResult {
    public int code;
    public boolean isSuc;
    public String message;
    public String name;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuc() {
        return isSuc;
    }

    public void setIsSuc(boolean isSuc) {
        this.isSuc = isSuc;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
