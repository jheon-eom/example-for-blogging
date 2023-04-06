package com.sample.blog.exceptionhadling;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomApiException.class)
    public ResponseEntity<ErrorResponse> apiValidationException(CustomApiException e) {
        log.error(e.getMessage());
        return ResponseEntity.status(e.getHttpStatus()).body(ErrorResponse.ERROR(e.getCode(), e.getMessage()));
    }

}
