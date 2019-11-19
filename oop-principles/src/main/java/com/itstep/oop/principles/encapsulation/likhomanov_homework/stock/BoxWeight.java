package com.itstep.oop.principles.encapsulation.likhomanov_homework.stock;

public class BoxWeight extends Box {

    private double weight;

    public BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }
}
