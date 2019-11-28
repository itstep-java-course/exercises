package com.itstep.oop.principles.inheritance.shyrkov_homework;

public class Rectangle extends Shape {

    protected double wigth;
    protected double height;

    Rectangle(String name, double wigth, double height){
        super(name);
        this.height = height;
        this.wigth = wigth;
    }


    @Override
    public double calculateArea() {
        return wigth*height;
    }
}
