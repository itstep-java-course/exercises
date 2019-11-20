package com.itstep.oop.principles.inheritance.borovoy_homework;

 class Shapes {
    private final Shape[] shapes;

    Shapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    double getSquare() {
        double square = 0.0;

        for (Shape shape : shapes) {
            square += shape.getSquare();
        }
        return square;
    }
}
