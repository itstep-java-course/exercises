package com.itstep.oop.principles.inheritance.huk_homework.fixed;

abstract class Shape {
    private double a;
    private String name;

    public Shape(double a, String name) {
        this.a = a;
        this.name = name;
    }

    public double getA() {
        return a;
    }

    public String getName() {
        return name;
    }

    public abstract double getArea();
}
