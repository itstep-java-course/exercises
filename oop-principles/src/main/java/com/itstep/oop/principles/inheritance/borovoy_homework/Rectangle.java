package com.itstep.oop.principles.inheritance.borovoy_homework;

class Rectangle extends Shape {
    private double width;

    Rectangle(double length, double width, String name) {
        super(length, width, name);
        this.width = width;
    }

    @Override
    double getSquare() {
        double square = super.getSquare();
        return square / length * width;
    }

}

