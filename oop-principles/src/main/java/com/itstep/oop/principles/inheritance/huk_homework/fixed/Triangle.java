package com.itstep.oop.principles.inheritance.huk_homework.fixed;

public class Triangle extends Shape {

    protected Triangle(double a, double h) {
        super(a, "Triangle");
        this.h = h;
    }

    private double h;

    public double getH() {
        return h;
    }

    @Override
    public double getArea() {
        return this.getA() * h / 2;
    }
}
