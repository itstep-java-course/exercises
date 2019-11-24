package com.itstep.oop.principles.inheritance.borovoy_homework;

class Shapes {
    private final Shape[] shapes;

    Shapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    double getSquare() {
        double square = 0.0;

        for (Shape shape : shapes) {
            System.out.println(shape.getName() + " square: " + shape.getSquare());
            square += shape.getSquare();
        }
        return square;
    }
}

