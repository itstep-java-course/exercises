package com.itstep.oop.principles.inheritance.dudkin_homework.not_API;

public class Rectangle extends Shape {
    public Rectangle(double[] side, String name) {
        super(2, side, name);
    }

    @Override
    public double calcArea() {
        area = side[0] * side[1];
        return area;
    }
}
