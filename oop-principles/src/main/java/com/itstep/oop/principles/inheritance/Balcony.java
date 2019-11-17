package com.itstep.oop.principles.inheritance;

public class Balcony extends Room {

    Balcony(double length, double width) {
        super(length, width);
    }

    @Override
    double getPayableSquare() {
        double square = super.getPayableSquare();
        return square / 2;
    }
}
