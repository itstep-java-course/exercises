package com.itstep.collections.huk_homework.table;


public class RoundTable extends Table {


    public RoundTable(String name, double surfaceArea) {
        super(name, surfaceArea);
    }

    @Override
    public double getArea() {
        return 0;
    }
}
