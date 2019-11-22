package com.itstep.oop.principles.inheritance.perepeliatnyk_homework;

public class Triangle extends Shape {

    public Triangle(String name, double length, double width) {
        super(name, length, width);
    }

    @Override
    public double getArea() {
        return getLength() * getWidth() / 2;
    }
}
