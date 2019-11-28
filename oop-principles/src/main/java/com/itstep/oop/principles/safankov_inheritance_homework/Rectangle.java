package com.itstep.oop.principles.safankov_inheritance_homework;

public class Rectangle extends Shape {

     private double length;
     private double width;
     public Rectangle(String ShapeName,double length,double width){
         super(ShapeName);
         this.length=length;
         this.width=width;
     }
     public Rectangle(double length,double width){
         super("Rectangle");
         this.width=width;
         this.length=length;
     }
    @Override
    public double getArea() {
        return length * width;
    }
}
