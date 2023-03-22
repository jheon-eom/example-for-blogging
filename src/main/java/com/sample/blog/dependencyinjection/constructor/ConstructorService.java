package com.sample.blog.dependencyinjection.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConstructorService {
    private final ConstructorCaller constructorCaller;

    @Autowired
    public ConstructorService(ConstructorCaller constructorCaller) {
        this.constructorCaller = constructorCaller;
    }

    public void call() {
        constructorCaller.call();
    }
}

