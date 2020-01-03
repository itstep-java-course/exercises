package com.itstep.collections.hashset.likhomanov_homework.set_of_tables;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TableAreaTest {

    public static void main(String[] args) {

        Comparator<Table> reverseComp = Collections.reverseOrder();

        SortedSet<Table> tables = new TreeSet<>(reverseComp);

        tables.add(new RoundTable("Round Table #1", 5.2));
        tables.add(new RoundTable("Round Table #2", 8.4));
        tables.add(new RoundTable("Round Table #3", 3.6));
        tables.add(new RectangleTable("Rectangle Table #1", 1.2, 4.0));
        tables.add(new RectangleTable("Rectangle Table #2", 2.2, 3.0));
        tables.add(new RectangleTable("Rectangle Table #3", 2.2, 6.0));
        tables.add(new SquareTable("Square Table #1", 2.2));
        tables.add(new SquareTable("Square Table #2", 3.0));
        tables.add(new SquareTable("Square Table #3", 0.6));

        for (Table table : tables) {
            System.out.println(table);
        }
    }
}