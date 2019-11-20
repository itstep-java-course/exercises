package com.itstep.oop.principles.inheritance.dudkin_homework;

import com.itstep.oop.principles.inheritance.dudkin_homework.not_API.*;

public class CalculatorOfAreas {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 5, "1");
        Shape triangle = new Triangle(4, 5, 6, "2");
        Shape square = new Square(2, "3");
        Shape rightTriangle = new RightTriangle(10, 5, 2, "4");
        Shape[] figure = new Shape[]{rectangle, triangle, square, rightTriangle};
        for (int i = 0; i < 4; i++) {
            System.out.println(figure[i].calcArea());
        }
        System.out.println(getTotalArea(figure));
    }

    public static double getTotalArea(Shape[] figure) {
        double totalArea = 0;
        for (int i = 0; i < figure.length; i++)
            totalArea += figure[i].calcArea();
        return totalArea;
    }

}
