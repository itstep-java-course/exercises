package com.itstep.oop.principles.inheritance.likhomanov_homework;

abstract class Polygon {

    private double[] sides;
    private String name;

    Polygon(String name, double... sides) {
        this.name = name;
        this.sides = sides;
    }

    abstract double getArea();

    double[] getSides() {
        return sides;
    }

    String getName() {
        return name;
    }
}
