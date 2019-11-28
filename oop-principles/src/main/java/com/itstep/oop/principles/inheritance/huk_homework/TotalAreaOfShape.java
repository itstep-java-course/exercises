package com.itstep.oop.principles.inheritance.huk_homework;

public class TotalAreaOfShape {
    private Shape[] shapes;

    TotalAreaOfShape(Shape[] shapes) {
        this.shapes = shapes;
    }

    double getSquare() {
        double square = 0.0;

        for (Shape shape : shapes) {
            square += shape.getPayableSquare();
        }
        return square;
    }
}
