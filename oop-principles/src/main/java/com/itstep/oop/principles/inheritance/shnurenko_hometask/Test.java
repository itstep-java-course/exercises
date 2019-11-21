package com.itstep.oop.principles.inheritance.shnurenko_hometask;

public class Test {
    public static void main(String[] args) {
        Shape triangle = new Triangle(1.2, 3.4);
        Shape square = new Square(2.3);
        Shape rectangle = new Rectangle(2.4, 5.6);

        Shape[] shapes = new Shape[]{triangle, square, rectangle};

        double area = 0.0;
        for (Shape shape : shapes) {
            area += shape.getArea();

            System.out.println(shape.getName());
            System.out.println(shape.getArea());
        }

        System.out.println("total area: " + area);
    }
}
