package com.cloud.infrastructure.common.beans;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;

public class ResultBean<T> implements Serializable {
    public static final int SUCCESS = 200;
    public static final int FAIL = 500;
    public static final int REDIRECT = 301;
    public static final int INVALID = 409;
    private String msg;
    private int code;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String url;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fn;
    private T result;

    public ResultBean() {
        this.msg = "success";
        this.code = 200;
    }

    public ResultBean(T result) {
        this(result, "success", "failed");
    }

    public ResultBean(T result, int code, String success, String url, String error, String fn) {
        this.msg = "success";
        this.code = 200;
        this.fn = fn;
        if (result != null && result != Boolean.FALSE) {
            if (result instanceof Throwable) {
                this.msg = result.toString();
                this.code = 500;
            } else {
                this.code = code;
                this.msg = success;
                this.url = url;
                this.result = result;
            }
        } else {
            this.code = 500;
            this.msg = error;
        }

    }

    public ResultBean(T result, String success, String error) {
        this(result, 200, success, null, error, null);
    }

    public ResultBean(T result, String success, String url, String error) {
        this(result, 301, success, url, error, null);
    }

    public ResultBean(Throwable e) {
        this.msg = "success";
        this.code = 200;
        this.msg = e.toString();
        this.code = 500;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", url='" + url + '\'' +
                ", fn='" + fn + '\'' +
                ", result=" + result +
                '}';
    }
}
