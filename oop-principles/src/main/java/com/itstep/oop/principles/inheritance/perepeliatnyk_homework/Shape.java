package com.itstep.oop.principles.inheritance.perepeliatnyk_homework;

public abstract class Shape {
    private String name;
    private double length;
    private double width;


    public Shape(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public Shape(String name, double circle){
        this.name = name;
        this.length = circle;
        this.width = 0.0;
    }

    public abstract double getArea();

    public String getName(){
        return name;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
