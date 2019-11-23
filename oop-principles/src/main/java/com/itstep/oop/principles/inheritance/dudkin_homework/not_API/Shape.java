package com.itstep.oop.principles.inheritance.dudkin_homework.not_API;

public abstract class Shape {
    protected double[] side;
    protected double area;

    Shape(int numbOfSides, double[] side) {
        this.side = new double[numbOfSides];
        for (int i = 0; i < side.length; i++) {
            this.side[i] = side[i];
        }
    }

    abstract public double calcArea();
}
