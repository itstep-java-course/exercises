package com.itstep.oop.principles.inheritance.likhomanov_homework;

class Circle extends Polygon {

    Circle(String name, double circumference) {
        super(name, circumference);
    }

    @Override
    double getArea() {
        return (getSides()[0] * getSides()[0]) / (4.0 * 3.14);
    }
}
