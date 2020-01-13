package com.itstep.collections.arraylist.borovoy_newyearhomework;

import java.util.*;

public   class Table implements Comparable<Table> {
    private double surfaceSquare;
    private String name;

     Table(double surfaceSquare, String name) {
        this.surfaceSquare = surfaceSquare;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Table{" +
                "surfaceSquare=" + surfaceSquare +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Table o) {
        return Double.compare(surfaceSquare, o.surfaceSquare);
    }
}

