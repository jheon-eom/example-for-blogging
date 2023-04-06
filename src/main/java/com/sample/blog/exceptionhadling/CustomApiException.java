package com.sample.blog.exceptionhadling;

public class CustomApiException extends RuntimeException {
    private int code;
    private int httpStatus;
    private String message;

    public CustomApiException(ExplainableError explainableError) {
        super(explainableError.getMessage());
        this.code = explainableError.getCode();
        this.httpStatus = explainableError.getStatus();
        this.message = explainableError.getMessage();
    }

    public int getCode() {
        return code;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
