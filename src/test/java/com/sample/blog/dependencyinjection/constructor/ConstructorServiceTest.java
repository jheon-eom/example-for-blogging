package com.sample.blog.dependencyinjection.constructor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorServiceTest {

    @Test
    @DisplayName("생성자 주입 클래스 테스트")
    void constructorServiceTest() {
        ConstructorService constructorService = new ConstructorService(new ConstructorCaller());
        constructorService.call();
    }
}
