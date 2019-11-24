package com.itstep.oop.principles.inheritance.borovoy_homework;

 class SquareOfShapes {
  public static void main(String[] args) {


   Shape square = new Square(4,  "Square");
   Shape rectangle = new Rectangle(2, 4, "Rectangle");
   Shape equilateralTriangle = new Triangle(4, 5,  "Equilateral triangle");

   Shape[] shapes = new Shape[]{square, rectangle, equilateralTriangle};

   Shapes shape = new Shapes(shapes);

   double squareOfShapes = shape.getSquare();

   System.out.println("The  square of shapes is: " + squareOfShapes);
  }
 }
