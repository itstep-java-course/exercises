package com.itstep.oop.principles.inheritance.borovoy_homework;

class Triangle extends Shape {
    private double height;

    Triangle(double length, double height, String name) {
        super(length,  name);
        this.height = height;
    }

    @Override
    double getSquare() {
        double square = super.getSquare();
        return square * height / (2 * length);
    }
}
