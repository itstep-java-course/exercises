package com.itstep.oop.principles.inheritance.huk_homework.fixed;

public class Rectangle extends Shape {
    protected Rectangle(double a, double b) {
        this(a, b, "Rectangle");
    }

    protected Rectangle(double a, double b, String name) {
        super(a, name);
        this.b = b;
    }

    private double b;

    public double getB() {
        return b;
    }

    @Override
    public double getArea() {
        return this.getA() * b;
    }
}
