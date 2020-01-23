package com.itstep.collections.arraylist.borovoy_newyearhomework;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TableTest {
    public static void main(String[] args) {

        Comparator<Table> reverse = Collections.reverseOrder();

        SortedSet<Table> tables = new TreeSet<>(reverse);

        tables.add(new RoundTable(22, "RoundTable"));
        tables.add(new SquareTable(20, "SquareTable"));
        tables.add(new RectangleTable(27.5, "RectangleTable"));

        for (Table table : tables) {
            System.out.println(table);
        }
    }
}