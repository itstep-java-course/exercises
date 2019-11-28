package com.itstep.oop.principles.inheritance.strahov_hometask;

public class Triangle extends Shape {
    private double lenght;
    private double height;
    public Triangle(double weight,double height){
        super ("Triangle");
        this.height=height;
        this.lenght=weight;

    }
    @Override
    public double getArea(){
        return lenght * height  /2;
    }
}
