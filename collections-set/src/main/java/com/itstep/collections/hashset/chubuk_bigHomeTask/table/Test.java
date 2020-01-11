package com.itstep.collections.hashset.chubuk_bigHomeTask.table;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Comparator<Table> fromMoreToLessTable = Collections.reverseOrder();
        SortedSet<Table> tables = new TreeSet<>(fromMoreToLessTable);

        tables.add(new CircleTable("circle1", 12));
        tables.add(new CircleTable("circle2", 6));
        tables.add(new ElipsTable("elips1", 134, 3));

        for (Table table:tables){
            System.out.println(table);
        }
    }
}
