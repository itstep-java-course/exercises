package com.itstep.collections.hashset.likhomanov_homework.set_of_tables;

class RoundTable extends Table {

    RoundTable(String model, double circumference) {
        super(model, circumference);
    }

    @Override
    double calculateArea(double... sides) {
        return (sides[0] * sides[0]) / (4.0 * 3.14);
    }
}
