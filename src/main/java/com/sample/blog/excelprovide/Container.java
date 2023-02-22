package com.sample.blog.excelprovide;

public class Container<T1, T2> {
    private T1 list;
    private T2 excel;

    public Container(T1 list, T2 excel) {
        this.list = list;
        this.excel = excel;
    }

    public T1 getList() {
        return list;
    }

    public T2 getExcel() {
        return excel;
    }
}
