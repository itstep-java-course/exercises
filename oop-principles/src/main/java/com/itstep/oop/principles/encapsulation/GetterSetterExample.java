package com.itstep.oop.principles.encapsulation;

public class GetterSetterExample {
    public String name;
    private String lastName;
    private int age;

    public GetterSetterExample(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name == null ? "empty" : name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
