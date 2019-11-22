package com.itstep.oop.principles.inheritance.perepeliatnyk_homework;

public class Rectangle extends Shape {

    public Rectangle(String name, double length, double width) {
        super(name, length, width);
    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }
}
