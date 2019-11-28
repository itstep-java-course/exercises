package com.itstep.oop.principles.inheritance.chubuk_homework;

abstract class Shape {

    private double[] sides= new double[3];
    private String name;

    Shape(String name, double sides1)
    {
        this.name = name;
        this.sides[0] = sides1;
    }

    Shape(String name, double sides1, double sides2)
    {
        this.name = name;
        this.sides[0] = sides1;
        this.sides[1] = sides2;
    }

    Shape(String name, double sides1, double sides2, double sides3)
    {
        this.name = name;
        this.sides[0] = sides1;
        this.sides[1] = sides2;
        this.sides[2] = sides3;
    }

    abstract double getAreaArea();

    double[] getSides()
    {
        return sides;
    }

    String getName()
    {
        return name;
    }
}
