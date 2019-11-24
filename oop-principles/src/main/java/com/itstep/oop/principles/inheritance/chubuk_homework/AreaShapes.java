package com.itstep.oop.principles.inheritance.chubuk_homework;

public class AreaShapes
{
    public static void main(String[] args)
    {
        Shape rectangle = new Rectangle("rectangle",14.5, 63.2);
        Rectangle square = new Square("square", 111);
        Rectangle triangleRe = new RectangularTriangle("rectangular triangle", 3, 5);
        Shape triangle = new Triangle("triangle", 34, 23.45, 36);

        Shape[] shapes = {rectangle, square, triangle, triangleRe};

        for (Shape shape : shapes)
        {
            System.out.println("Area of " + shape.getName() + " is " + shape.getAreaArea());
        }
    }
}
