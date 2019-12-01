package com.itstep.oop.principles.inheritance.perepeliatnyk_homework;

public class Test {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Прямоугольник: ", 5.0, 3.0);
        Shape square = new Square("Квадрат: ", 5.0);
        Shape triangle = new Triangle("Треугольник: ", 4.0, 2.0);
        Shape circle = new Circle("Круг: ", 4);

        Shape[] shapes = new Shape[4];
        shapes[0] = rectangle;
        shapes[1] = square;
        shapes[2] = triangle;
        shapes[3] = circle;

        double area = 0.0;

        for (Shape shape : shapes) {
            area += shape.getArea();
            System.out.println(shape.getName() + shape.getArea());
        }
        System.out.println("Общая площадь: " + Math.rint(100.0 * area) / 100);
    }

}
