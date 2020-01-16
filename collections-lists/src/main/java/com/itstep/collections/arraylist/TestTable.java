package com.itstep.collections.arraylist;
import java.util.Collections;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestTable {
    public static void main(String[] args) {

        Comparator<Table> reverse = Collections.reverseOrder();

        SortedSet<Table> tables = new TreeSet<>(reverse);

        tables.add(new RoundTable(5.6, "RoundTable"));
        tables.add(new SquareTable(19, "SquareTable"));
        tables.add(new RectangleTable(12.5, "RectangleTable"));

        for (Table table : tables) {
            System.out.println(table);
        }
    }

}
