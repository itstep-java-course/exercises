package com.itstep.oop.principles.safankov_inheritance_homework;

  public class RightAngledTriangle extends Shape {//прямоугольный треугольник
     RightAngledTriangle(double width, double length){
         super(width,length);
     }
     @Override
     public double getArea(){
         double halfSquare = super.getArea();
         return halfSquare/2;
     }

}
