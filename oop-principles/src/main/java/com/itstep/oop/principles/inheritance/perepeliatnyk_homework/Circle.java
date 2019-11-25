package com.itstep.oop.principles.inheritance.perepeliatnyk_homework;

public class Circle extends Shape{
    private double length;

    public Circle(String name, double length) {
        super(name);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return (getLength() * getLength()) / (4.0 * 3.14);
    }
}
