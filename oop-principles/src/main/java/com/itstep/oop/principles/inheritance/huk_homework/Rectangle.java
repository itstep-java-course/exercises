package com.itstep.oop.principles.inheritance.huk_homework;

public class Rectangle extends Shape { //Прямоугольник

    private double b;

    public Rectangle(double a) {
        super(a);
        this.b = b;
    }

    double getVolumeRectangle() {
        return super.getPayableSquare() * b;
    }
}
//S=a*b;
