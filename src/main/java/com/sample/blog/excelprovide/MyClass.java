package com.sample.blog.excelprovide;

public class MyClass {
    public static void main(String[] args) {
        Container<String, Integer> result = getTwoObjects();
        String firstObject = result.getList();
        Integer secondObject = result.getExcel();
        System.out.println("First object: " + firstObject);
        System.out.println("Second object: " + secondObject);
    }

    public static Container<String, Integer> getTwoObjects() {
        String firstObject = "Hello, World!";
        Integer secondObject = 42;
        return new Container<String, Integer>(firstObject, secondObject);
    }
}
