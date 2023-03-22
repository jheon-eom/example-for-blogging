package com.sample.blog.dependencyinjection.field;

import org.springframework.stereotype.Component;

@Component
public class FieldCaller {

    public void call() {
        System.out.println("호출!!! FieldCaller call()");
    }
}
