package com.sample.blog.generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Product> list = new ArrayList<>();
//        Audio audio = new Audio();
//        Tv tv = new Tv();
//        list.add(tv);
//        list.add(audio);

        List<Tv> list = new ArrayList<>();
        Product product = new Product();
        Tv tv = (Tv) product;
        tv.tvMethod();

        Audio audio = new Audio();
//        list.add(audio);
        list.add(tv);

        Product product2 = new Tv();

    }
}
