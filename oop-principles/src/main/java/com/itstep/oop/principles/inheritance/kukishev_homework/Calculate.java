package com.itstep.oop.principles.inheritance.kukishev_homework;

public class Calculate {


    public static void main(String[] args) {
            Shape Square = new Square (8.5);
            Shape Triangle = new Triangle(5.6, 4.1);
            Shape Rectangle = new Rectangle(5.7, 7.7);
            Shape Trapezoid = new Trapezoid(2.2, 7.7, 5.0);


            Shape [] shapes = new Shape [] {Triangle, Square, Rectangle, Trapezoid};

            double area = 0.0;
            for (Shape shape : shapes){

                area += shape.getArea();
                System.out.println(shape.getName());
                System.out.println(shape.getArea());
            }

        System.out.println("total area = " + area);


    }






}
