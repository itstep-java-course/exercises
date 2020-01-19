package com.itstep.collections.dudkin_hometask;

public class Table implements Comparable<Table> {
    private Integer area;

    public Table(Integer area) {
        this.area = area;
    }

    public Integer getArea() {
        return area;
    }

    @Override
    public int compareTo(Table o) {
        return area.compareTo(o.area);
    }
}
