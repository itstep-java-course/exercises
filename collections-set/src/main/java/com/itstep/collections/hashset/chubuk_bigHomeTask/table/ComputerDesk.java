package com.itstep.collections.hashset.chubuk_bigHomeTask.table;

public class ComputerDesk extends Table{
    ComputerDesk(String type, double side1,double side2, double side3, double side4) {
        super(type, side1, side2, side3, side4);
    }

    @Override
    double calculateArea(double... sides) {
        return sides[0]*sides[1]+sides[3]*sides[4];
    }
}
