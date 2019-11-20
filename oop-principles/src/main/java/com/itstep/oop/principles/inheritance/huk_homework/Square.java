package com.itstep.oop.principles.inheritance.huk_homework;

public class Square extends Rectangle { //Квадрат

    public Square(double a) {
        super(a);
    }

    double getVolumeSquare() {
        return super.getPayableSquare() * super.getPayableSquare();
    }
}
//S=a*a;