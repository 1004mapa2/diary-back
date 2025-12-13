package com.example.diary.util;

public enum ResponseCode {
    SUCCESS(200, "C200", "커스텀 성공 메시지"),
    ERROR(400, "C400", "커스텀 에러 메시지");

    private int status;
    private String code;
    private String message;

    ResponseCode(int status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}