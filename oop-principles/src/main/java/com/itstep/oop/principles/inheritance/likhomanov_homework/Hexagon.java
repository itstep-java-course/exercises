package com.itstep.oop.principles.inheritance.likhomanov_homework;

class Hexagon extends Polygon {

    Hexagon(String name, double side) {
        super(name, side);
    }

    @Override
    double getArea() {
        return ((3.0 * Math.sqrt(3.0)) / 2.0) * getSides()[0] * getSides()[0];
    }
}
