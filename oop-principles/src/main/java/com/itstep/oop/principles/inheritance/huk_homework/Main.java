package com.itstep.oop.principles.inheritance.huk_homework;

public class Main {
    public static void main(String[] args) {


        Shape triangle = new Triangle(3.0, 2.0);
        Shape rectangle = new Rectangle(3.0);
        Rectangle square = new Square(2.0);

        Shape[] shapes = new Shape[]{triangle, rectangle, square};

        TotalAreaOfShape totalAreaOfShape = new TotalAreaOfShape(shapes);



        //Triangle triangle1 = new Triangle(3.0,2.0);
        //System.out.println(triangle1.getVolumeTriangle());

//        Rectangle rectangle1 = new Rectangle(4.0);
//        System.out.println(rectangle1.getVolumeRectangle());
//
//        Square square1 = new Square(4.0);
//        System.out.println(square1.getVolumeSquare());



       /* double square1 = TotalAreaOfShape.getSquare();
        System.out.println("The payable square of the building is: " + square1);

        Balcony balconyWithVolume = new Balcony(2.0, 1.2, 3.0);

        System.out.println(balconyWithVolume.getPayableSquare());
        System.out.println(balconyWithVolume.getVolume());*/

    }
}