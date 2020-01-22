package com.itstep.collections.perepeliatnyk_winter_homework.table;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestTable {

    public static void main(String[] args) {

        Comparator<Table> reverse = Collections.reverseOrder();

        SortedSet<Table> tables = new TreeSet<>(reverse);

        tables.add(new RectangleTable("RectangleTable: ", 30));
        tables.add(new RoundTable("RoundTable: ", 40));
        tables.add(new SquareTable("SquareTable: ", 50));

        for (Table table: tables) {
            System.out.println(table);

        }
    }
}
