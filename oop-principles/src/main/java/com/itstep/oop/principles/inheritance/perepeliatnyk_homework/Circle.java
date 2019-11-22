package com.itstep.oop.principles.inheritance.perepeliatnyk_homework;

public class Circle extends Shape{

    public Circle(String name, double circle) {
        super(name, circle);
    }

    @Override
    public double getArea() {
        return (getLength() * getLength()) / (4.0 * 3.14);
    }
}
