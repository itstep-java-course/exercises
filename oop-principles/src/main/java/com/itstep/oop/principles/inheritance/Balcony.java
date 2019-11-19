package com.itstep.oop.principles.inheritance;

class Balcony extends Room {
    private double height;

    Balcony(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    double getPayableSquare() {
        double square = super.getPayableSquare();
        return square / 2;
    }

    double getVolume() {
        return super.getPayableSquare() * height;
    }
}
