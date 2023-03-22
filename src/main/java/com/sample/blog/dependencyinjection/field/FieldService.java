package com.sample.blog.dependencyinjection.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FieldService {
    @Autowired
    private FieldCaller fieldCaller;

    public void call() {
        fieldCaller.call();
    }
}


