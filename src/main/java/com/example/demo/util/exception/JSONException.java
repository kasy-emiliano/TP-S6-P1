package com.example.demo.util.exception;

public class JSONException{
    private final String code;
    private final String message;

    public JSONException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
