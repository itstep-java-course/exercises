package com.itstep.oop.principles.inheritance.shnurenko_hometask;

public abstract class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getArea();
}
