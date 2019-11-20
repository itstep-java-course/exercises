package com.itstep.oop.principles.inheritance.likhomanov_homework;

public class AreaCalculator {

    public static void main(String[] args) {

        Polygon[] shapes = {
                new Circle("Circle", 132.0),
                new Triangle("Triangle", 36.0, 48.0, 64.0),
                new EquilateralTriangle("Equilateral Triangle", 126.0),
                new Rectangle("Rectangle", 50.0, 100.0),
                new Square("Square", 80.0),
                new Hexagon("Hexagon", 25.0)
        };

        getAreas(shapes);
    }

    private static void getAreas(Polygon[] shapes) {
        double totalArea = 0.0;

        for (Polygon shape : shapes) {
            totalArea += shape.getArea();
            System.out.println("Area of " + shape.getName() + " is " + shape.getArea());
        }

        System.out.println("Total area is " + totalArea);
    }
}
