package com.itstep.oop.principles.inheritance.shnurenko_hometask;

public class Triangle extends Shape {

    private double length;
    private double height;

    public Triangle(double length, double height) {
        super("Triangle");
        this.length = length;
        this.height = height;
    }

    @Override
    public double getArea() {
        return length * height / 2;
    }
}
