package com.itstep.oop.principles.inheritance.borovoy_homework;

class Square extends Rectangle {

    Square(double length, String name) {
        super(length, length, name);
    }

    @Override
    double getSquare() {
        double square = super.getSquare();
        return square / width * length;
    }
}
