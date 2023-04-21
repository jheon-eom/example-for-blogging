package com.sample.blog.nplusonesample;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Parent {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @OneToMany(mappedBy = "parent")
    private List<Child> children = new ArrayList<>();

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addChild(Child child) {
        this.children.add(child);
        child.addParent(this);
    }
}
