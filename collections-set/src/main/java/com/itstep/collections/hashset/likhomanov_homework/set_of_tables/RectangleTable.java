package com.itstep.collections.hashset.likhomanov_homework.set_of_tables;

class RectangleTable extends Table {

    RectangleTable(String model, double width, double length) {
        super(model, width, length);
    }

    @Override
    double calculateArea(double... sides) {
        return sides[0] * sides[1];
    }
}
