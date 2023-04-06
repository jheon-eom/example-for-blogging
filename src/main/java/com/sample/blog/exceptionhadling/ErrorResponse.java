package com.sample.blog.exceptionhadling;

import lombok.Getter;

@Getter
public class ErrorResponse {
    private final int errorCode;
    private final String errorMessage;

    public ErrorResponse(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public static ErrorResponse ERROR(int errorCode, String errorMessage) {
        return new ErrorResponse(errorCode, errorMessage);
    }
}
