package com.springdb.springdatabase.respond;

import com.google.gson.annotations.Expose;

public class CustomRespond {

    @Expose
    private String message;
    @Expose
    private int errorCode;
    @Expose
    private Object data;


    public CustomRespond(String message, int errorCode, Object data) {
        this.message = message;
        this.errorCode = errorCode;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
