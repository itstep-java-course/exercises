package com.itstep.collections.hashset.likhomanov_homework.set_of_tables;

abstract class Table implements Comparable<Table> {

    private double area;
    private String model;

    Table(String model, double... sides) {
        this.model = model;
        this.area = calculateArea(sides);
    }

    abstract double calculateArea(double... sides);

    @Override
    public String toString() {
        return model + " - " + "area: " + area;
    }

    @Override
    public int compareTo(Table o) {
        return Double.compare(area, o.area);
    }
}
