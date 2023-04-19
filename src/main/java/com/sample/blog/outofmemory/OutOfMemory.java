package com.sample.blog.outofmemory;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemory {

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();

        while (true) {
            objects.add(new Object());
        }
    }
}

class Object {

}
