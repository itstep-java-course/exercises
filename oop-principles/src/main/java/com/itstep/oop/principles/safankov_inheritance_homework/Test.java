package com.itstep.oop.principles.safankov_inheritance_homework;

public class Test {
    public static void main(String[] args) {
        Shape square = new Square(2);
        Shape rectangle=new Rectangle(2,6);
        Shape triangle=new RightAngledTriangle(3,2);
        Shape triangle2 = new EquilateralTriangle(6);
        Shape [] allShapes = new Shape[]{square,rectangle,triangle,triangle2};

        AllSquare squares = new AllSquare(allShapes);

        double mySquare = squares.getAllSquare();
        System.out.println("The square of all shapes is: " + mySquare);
    }
}
