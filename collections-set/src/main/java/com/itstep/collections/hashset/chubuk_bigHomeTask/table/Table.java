package com.itstep.collections.hashset.chubuk_bigHomeTask.table;

abstract public class Table implements Comparable<Table> {
    private double area;
    private String type;
    Table(String type, double ... sides) {
        this.area = calculateArea(sides);
        this.type = type;
    }

    abstract double calculateArea(double... sides);

    @Override
    public String toString() {
        return type + " " + area;
    }

    @Override
    public int compareTo(Table o) {
        int compare = Double.compare(area, o.area);
        return compare;
    }
}
