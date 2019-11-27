package com.itstep.oop.principles.inheritance.strahov_hometask;

public class Test {
    public static void main (String[] args  ){
        Shape triangle = new Triangle(1.44,1.23);
        Shape square = new Square(3.55);
        Shape rectangle = new Rectangle(72.34, 54.65);

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
