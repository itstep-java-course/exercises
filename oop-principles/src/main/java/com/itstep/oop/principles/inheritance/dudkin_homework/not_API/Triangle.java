package com.itstep.oop.principles.inheritance.dudkin_homework.not_API;

import com.itstep.oop.principles.inheritance.dudkin_homework.not_API.Shape;

import static java.lang.Math.sqrt;

public class Triangle extends Shape {
    public Triangle(double[] side, String name) {
        super(3, side, name);

    }

    @Override
    public double calcArea() {
        double p = (side[0] + side[1] + side[2]) / 2;
        area = sqrt(p * (p - side[0]) * (p - side[1]) * (p - side[2]));
        return area;
    }
}
