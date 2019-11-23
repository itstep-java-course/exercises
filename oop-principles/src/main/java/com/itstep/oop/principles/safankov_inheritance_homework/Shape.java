package com.itstep.oop.principles.safankov_inheritance_homework;

public abstract class Shape {
    private String ShapeName;

    public Shape(String ShapeName){
        this.ShapeName=ShapeName;
    }
    public String showName(){
        return ShapeName;
    }
    public abstract double getArea();


}
