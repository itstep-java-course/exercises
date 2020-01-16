package com.itstep.collections.dudkin_hometask;

public class Table implements Comparable<Table> {
    private int area;

    public Table(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    @Override
    public int compareTo(Table o) {
        String area = Integer.toString(this.area);
        return area.compareTo(Integer.toString(o.area));
    }
}
