package com.itstep.oop.principles.inheritance.dudkin_homework.not_API;

public abstract class Shape {
    protected String name;
    protected double[] side = new double[3];
    protected double area;

    Shape(double side1, double side2,String name) {
        this.side[0] = side1;
        this.side[1] = side2;
        this.name=name;
    }

    abstract public double calcArea();
}
