package com.itstep.collections.huk_homework.table;

import javafx.print.Collation;

import java.util.*;

/*
Создать class Table. У класса должно быть поле “площадь поверхности”. Отсортировать столы по площади поверхности начиная
 с наибольшей. Table должен быть Comparable. Вывести элементы в консоль. Для решения задачи используйте TreeSet
 */
public abstract class Table implements Comparable { //стол

    private double a;
    private String name;

    public Table(double a, String name) {
        this.a = a;
        this.name = name;
    }

    public double getA() {
        return a;
    }

    public String getName() {
        return name;
    }

    public abstract double getArea();

//    public Table(String type, double side1, double side2) {
//    }


    @Override
    public int compareTo (Object o){
        return 0;
    }

    public static void main(String[] args) {


        Comparator<Table> fromLargerToSmallerTable = Collections.reverseOrder();
        SortedSet<Table> tables = new TreeSet<>(fromLargerToSmallerTable);

        tables.add(new TriangularTable("triangular",12, 12));

        for (Table table:tables){
            System.out.println(table);
        }

    }
}
