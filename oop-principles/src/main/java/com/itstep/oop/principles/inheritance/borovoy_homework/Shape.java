package com.itstep.oop.principles.inheritance.borovoy_homework;

class Shape {
    protected double length;
    public double width;
    private String name;

    Shape(double length, double width, String name) {
        this.length = length;
        this.width = width;
        this.name = name;
    }

    double getSquare() {
        return length * width;
    }

    public String getName() {
        return name;
    }
}
