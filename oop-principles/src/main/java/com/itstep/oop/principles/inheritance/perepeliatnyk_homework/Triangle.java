package com.itstep.oop.principles.inheritance.perepeliatnyk_homework;

public class Triangle extends Shape {
    private double length;
    private double width;

    public Triangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;

    }

    public double getLength(){
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return getLength() * getWidth() / 2;
    }
}
