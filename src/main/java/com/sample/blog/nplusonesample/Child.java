package com.sample.blog.nplusonesample;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Child {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @ManyToOne(fetch = FetchType.LAZY)
    private Parent parent;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addParent(Parent parent) {
        this.parent = parent;
    }
}
