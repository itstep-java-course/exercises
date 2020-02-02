package com.itstep.collections.starhov_homework.table;

public class RoundTable extends Table {
    private final String name;

    {


        public RoundTable(String name, double surfaceArea) {
            super(name, surfaceArea);
        }

       
    }

    public RoundTable(String s, int i, String name) {
        super(s, side1, i);
        this.name = name;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
