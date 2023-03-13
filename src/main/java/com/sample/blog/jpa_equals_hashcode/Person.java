package com.sample.blog.jpa_equals_hashcode;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return name.equals(other.name) && age == other.age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);

        System.out.println("person1 hashcode: " + person1.hashCode());
        System.out.println("person2 hashcode: " + person2.hashCode());

        System.out.println("person1 equals person2: " + person1.equals(person2));
    }
}
