package com.itstep.oop.principles.inheritance.likhomanov_homework;

class Triangle extends Polygon {

    Triangle(String name, double sideA, double sideB, double sideC) {
        super(name, sideA, sideB, sideC);
    }

    @Override
    double getArea() {
        double p = (getSides()[0] + getSides()[1] + getSides()[2])/2.0;
        return Math.sqrt(p * (p - getSides()[0]) * (p - getSides()[1]) * (p - getSides()[2]));
    }
}
