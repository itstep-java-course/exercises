package com.itstep.oop.principles.inheritance.dudkin_homework.not_API;

import com.itstep.oop.principles.inheritance.dudkin_homework.not_API.Shape;

import static java.lang.Math.sqrt;

public class Triangle extends Shape {
    public Triangle(double side1, double side2, double side3, String name) {
        super(side1, side2, name);
        this.side[2] = side3;
    }

    @Override
    public double calcArea() {
        double p = (side[0] + side[1] + side[2]) / 2;
        area = sqrt(p * (p - side[0]) * (p - side[1]) * (p - side[2]));
        return area;
    }
}
