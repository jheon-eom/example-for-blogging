package com.sample.blog.exceptionhadling;

public interface ExplainableError {

    int getStatus();
    int getCode();
    String getMessage();
}
