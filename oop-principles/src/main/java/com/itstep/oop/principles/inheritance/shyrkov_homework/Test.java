package com.itstep.oop.principles.inheritance.shyrkov_homework;

public class Test {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Rect", 5,4);
        Shape square = new Square("Square", 5);
        Shape triangle = new Triangle("Trian", 3,5);

        System.out.println(rectangle.name+" = "+rectangle.calculateArea());
        System.out.println(square.name+" = "+square.calculateArea());
        System.out.println(triangle.name+" = "+triangle.calculateArea());

        Shape[] shapes = {new Rectangle("Rect", 5,4), new Square("Square", 5), new Triangle("Trian", 3,5)};
        double allArea = 0;
        for (Shape shape : shapes) {
            allArea+=shape.calculateArea();
        }
        System.out.println("All area = "+allArea);

    }
}
