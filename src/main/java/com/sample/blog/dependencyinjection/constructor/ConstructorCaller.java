package com.sample.blog.dependencyinjection.constructor;

import org.springframework.stereotype.Component;

@Component
public class ConstructorCaller {

    public void call() {
        System.out.println("호출!!! ConstructorCaller call()");
    }
}

