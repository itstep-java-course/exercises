package com.itstep.collections.dudkin_hometask;

import java.util.SortedSet;
import java.util.TreeSet;

public class TableTest {
    public static void main(String[] args) {
        SortedSet<Table> tables = new TreeSet<>();
        tables.add(new Table(33));
        tables.add(new Table(24));
        tables.add(new Table(1));
        tables.add(new Table(13));
        for (Table s : tables) {
            System.out.println(s.getArea());
        }
    }
}
