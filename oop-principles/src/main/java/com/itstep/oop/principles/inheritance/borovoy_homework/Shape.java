package com.itstep.oop.principles.inheritance.borovoy_homework;

 class Shape {
    protected double length;
   // protected double width;
    private String name;

    Shape(double length,  String name) {
        this.length = length;
        //this.width = width;
        this.name= name;
    }
    double getSquare() {
        return length * length;
    }
}
