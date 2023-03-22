package com.sample.blog.dependencyinjection.field;

import com.sample.blog.dependencyinjection.field.FieldCaller;
import com.sample.blog.dependencyinjection.field.FieldService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FieldServiceTest {
    @InjectMocks
    FieldService fieldService;
    @Spy
    FieldCaller fieldCaller;

    @Test
    @DisplayName("필드 주입 클래스 테스트")
    void fieldServiceTest() {
//        FieldService fieldService = new FieldService();
        fieldService.call();
    }
}

