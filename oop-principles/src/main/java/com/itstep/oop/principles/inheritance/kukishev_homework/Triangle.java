package com.itstep.oop.principles.inheritance.kukishev_homework;

public class Triangle extends Shape {

   private double lenght;
   private double height;

   public Triangle (double lenght, double height){
       super("Triangle");
       this.height = height;
       this.lenght = lenght;

   }


    @Override
    public double getArea() {
        return lenght * height / 2;
    }
}
