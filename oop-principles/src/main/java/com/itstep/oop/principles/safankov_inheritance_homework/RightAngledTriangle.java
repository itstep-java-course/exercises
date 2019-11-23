package com.itstep.oop.principles.safankov_inheritance_homework;

  public class RightAngledTriangle extends Shape {//прямоугольный треугольник
      public double length;
      private double height;

      public RightAngledTriangle(double length, double height){
          super("RightAngledTriangle");
          this.length = length;
          this.height = height;
      }
     @Override
     public double getArea(){
     return length * height / 2;
     }

}
