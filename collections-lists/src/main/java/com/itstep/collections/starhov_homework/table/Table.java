package com.itstep.collections.starhov_homework.table;

public abstract class Table implements Comparable<Table> {
    private String name;
    private double surfaceArea;

    public Table( String name, double surfaceArea) {
        this.name = name;
        this.surfaceArea = surfaceArea;
    }


    public String getName() {
        return name;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public abstract double getArea();


    @Override
    public int compareTo(Table o) {
        return Double.compare(surfaceArea, o.surfaceArea);
    }


    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                ", surfaceArea=" + surfaceArea +
                '}';
    }
}

