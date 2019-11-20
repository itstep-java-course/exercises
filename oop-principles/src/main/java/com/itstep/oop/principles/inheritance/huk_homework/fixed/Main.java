package com.itstep.oop.principles.inheritance.huk_homework.fixed;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(3.0, 2.0);
        Shape rectangle = new Rectangle(3.0, 2.0);
        Shape square = new Square(2.0);

        Shape[] shapes = new Shape[]{triangle, rectangle, square};

        double totalArea = 0.0;
        for (Shape shape : shapes) {
            System.out.println(shape.getName() + " area: " + shape.getArea());
            totalArea = totalArea + shape.getArea();
        }
        System.out.println("Total area: " + totalArea);
    }
}
