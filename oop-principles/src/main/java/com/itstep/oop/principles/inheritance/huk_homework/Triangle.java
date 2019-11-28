package com.itstep.oop.principles.inheritance.huk_homework;

public class Triangle extends Shape { //Треугольник

    private double h;

    public Triangle(double a, double h) {
        super(a);
        this.h = h;
    }

    double getVolumeTriangle() {
        return (super.getPayableSquare() * h) / 2;
    }
}
//S=(a*h)/2;