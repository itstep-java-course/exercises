package com.itstep.collections.hashset.chubuk_bigHomeTask.table;

public class ElipsTable extends Table{
    ElipsTable(String type, double side1, double side2) {
        super(type, side1, side2);
    }

    @Override
    double calculateArea(double... sides) {
        return sides[0]*sides[0]*3.14/4;
    }
}
