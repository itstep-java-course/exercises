package com.itstep.collections.starhov_homework.table;

public class SquareTable extends Table {
    public SquareTable(String name, double surfaceArea) {
        super(name, side1, surfaceArea);
    }

    @Override
    public double getArea() {
        return 0;
    }
}
