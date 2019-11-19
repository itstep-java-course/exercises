package com.itstep.oop.principles.inheritance;

class Room {
    private final double length;
    private final double width;

    Room(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getPayableSquare() {
        return length * width;
    }
}
