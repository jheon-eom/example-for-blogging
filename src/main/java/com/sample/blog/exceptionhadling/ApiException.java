package com.sample.blog.exceptionhadling;

import org.springframework.http.HttpStatus;

public enum ApiException implements ExplainableError {

    ERROR_A(1, "에러 A입니다."),
    ERROR_B(2, "에러 B입니다."),
    ERROR_C(3, "에러 C입니다.");

    ApiException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int status;
    private int code;
    private String message;

    @Override
    public int getStatus() {
        return HttpStatus.BAD_REQUEST.value();
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
