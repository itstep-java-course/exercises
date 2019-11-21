package com.itstep.oop.principles.inheritance.dudkin_homework.not_API;

public abstract class Shape {
    protected String name;
    protected double[] side;
    protected double area;

    Shape(int numbOfSides, double[] side, String name) {
        this.side = new double[numbOfSides];
        for (int i = 0; i < side.length; i++) {
            this.side[i] = side[i];
        }
        this.name = name;
    }

    abstract public double calcArea();
}
