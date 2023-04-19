package com.sample.blog.outofmemory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OOMController {

    @GetMapping("/register")
    public Integer registerCourse() {
        List<Call> calls = new ArrayList<>();
        for (int i = 0; i < 1000000000; i++) {
            calls.add(new Call());
        }
        return calls.size();
    }
}

class Call {
    private String call = "call";
}