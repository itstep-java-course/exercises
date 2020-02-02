package com.itstep.collections.starhov_homework.table;

public class RectangleTable extends Table {

    void RectanguleTable(String type, double side1, double side2) {
        super(type, side1, side2);
    }

    @Override
    double calculateArea(double... sides) {
        return sides[0]*sides[2];
    }
}
