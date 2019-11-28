package com.itstep.oop.principles.safankov_inheritance_homework;

public class Test {
    public static void main(String[] args) {
        Shape square = new Square(2);
        Shape rectangle=new Rectangle(2,6);
        Shape triangle=new RightAngledTriangle(2,5);
        Shape triangle2 = new EquilateralTriangle(6);

        Shape [] allShapes = new Shape[]{square,rectangle,triangle,triangle2};

        double area = 0.0;
        for (Shape shape : allShapes) {
            area += shape.getArea();

            System.out.println(shape.showName());
            System.out.println(shape.getArea());
        }

        System.out.println("total area: " + area);
    }
    }

