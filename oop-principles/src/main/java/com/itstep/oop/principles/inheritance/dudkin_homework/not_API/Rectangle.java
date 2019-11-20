package com.itstep.oop.principles.inheritance.dudkin_homework.not_API;

public class Rectangle extends Shape {
    public Rectangle(double side1, double side2, String name) {
        super(side1, side2, name);
    }

    @Override
    public double calcArea() {
        area = side[0] * side[1];
        return area;
    }
}
