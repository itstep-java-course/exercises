package com.itstep.oop.principles.safankov_inheritance_homework;

public class AllSquare {

    private Shape[] allShapes;

    AllSquare(Shape[]allShapes){
        this.allShapes=allShapes;
    }
    double getAllSquare() {
        double square = 0.0;

        for (Shape shapes : allShapes) {
            square = square + shapes.getArea();
        }
        return square;
    }
}
