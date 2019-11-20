package com.itstep.oop.principles.encapsulation.likhomanov_homework.stock;

public class Box {

    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.depth = box.depth;
        box.width = 20.0;           //WTF!!!!
    }

    double volume() {
        return width * height * depth;
    }
}
