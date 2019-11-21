package com.itstep.oop.principles.safankov_inheritance_homework;

public class Shape {
    public double width;
    public double length;
    public Shape(double width,double length){
        this.length=length;
        this.width=width;
    }
    public double getArea(){
        return length*width;
    }
}
