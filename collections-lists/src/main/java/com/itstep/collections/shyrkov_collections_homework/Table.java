package com.itstep.collections.shyrkov_collections_homework;

public class Table implements Comparable<Table> {

    private double square;

    public Table(double square) {
        this.square = square;
    }

    @Override
    public int compareTo(Table table) {
        if(this.square<=table.square)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return String.valueOf(square);
    }
}
