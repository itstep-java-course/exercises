package com.itstep.oop.principles.inheritance.shyrkov_homework;

public class Test {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Rect", 5, 4); //Это запятая, а не точка)
        Shape square = new Square("Square", 5);
        Shape triangle = new Triangle("Trian", 3, 5); //Это тоже запятая (сторона основания и высота к ней)

        System.out.println(rectangle.name+" = "+rectangle.calculateArea());
        System.out.println(square.name+" = "+square.calculateArea());
        System.out.println(triangle.name+" = "+triangle.calculateArea());

        Shape[] shapes = {rectangle, square, triangle};
        double allArea = 0;
        for (Shape shape : shapes) {
            allArea+=shape.calculateArea();
        }
        System.out.println("All area = "+allArea);

    }
}
