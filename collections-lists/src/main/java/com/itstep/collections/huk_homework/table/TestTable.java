package com.itstep.collections.huk_homework.table;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestTable {
    public static void main(String[] args) {

        Comparator<Table> reverse = Collections.reverseOrder();

        SortedSet<Table> tables = new TreeSet<>(reverse);

        tables.add(new RectangleTable("RectangleTable: ", 22));
        tables.add(new RoundTable("RoundTable: ", 23));
        tables.add(new SquareTable("SquareTable: ", 24));

        for (Table table: tables) {
            System.out.println(table);

        }
    }
}
