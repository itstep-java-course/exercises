package com.itstep.oop.principles.inheritance.likhomanov_homework;

class Rectangle extends Polygon {

    Rectangle(String name, double height, double width) {
        super(name, height, width);
    }

    @Override
    double getArea() {
        return getSides()[0] * getSides()[1];
    }
}
