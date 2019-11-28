package com.itstep.oop.principles.inheritance.shyrkov_homework;

public class Triangle extends Shape {

    double side;
    double heightToSide;

    Triangle(String name, double side, double heightToSide){
        super(name);
        this.side = side;
        this.heightToSide = heightToSide;
    }

    @Override
    public double calculateArea() {
        return (side*heightToSide)/2;
    }
}
