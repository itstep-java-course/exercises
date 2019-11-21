package com.itstep.oop.principles.inheritance.dudkin_homework.not_API;

import com.itstep.oop.principles.inheritance.dudkin_homework.not_API.Rectangle;

public class Square extends Rectangle {
    public Square(double[] side, String name) {
        super(side, name);
    }

    @Override
    public double calcArea() {
        area = side[0] * side[0];
        return area;
    }

}
