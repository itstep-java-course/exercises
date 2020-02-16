package com.itstep.collections.hashset.chubuk_bigHomeTask;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
1. Написать цикл который добавляет элементы в лист. Количество элементов 500_000.
    - замерить время добавления элементов в конец метод add для ArrayList и LinkedList
    - замерить время добавления элементов в начало метод add(0, element) для ArrayList и LinkedList
    - замерить время добавления элементов в середину метод add(200_000, element) для ArrayList и LinkedList
    - замерить время удаления элемента из середины метод remove(200_000) для ArrayList и LinkedList
 */

public class ListTimeTest {
    public static void main(String[] args) {
        System.out.println("Add in the end for ArrayList");
        testAddingInTheEnd(new ArrayList<>());
        System.out.println("Add in the end for LinkedList");
        testAddingInTheEnd(new LinkedList<>());

        System.out.println("Add in the beginning for ArrayList");
        testAddingInTheBeginning(new ArrayList<>());
        System.out.println("Add in the beginning for LinkedList");
        testAddingInTheBeginning(new LinkedList<>());

        System.out.println("Add in the middle for ArrayList");
        testAddingInTheMiddle(new ArrayList<>());
        System.out.println("Add in the middle for LinkedList");
        testAddingInTheMiddle(new LinkedList<>());

        System.out.println("Remove from the middle for ArrayList");
        testRemoveFromTheMiddle(new ArrayList<>());
        System.out.println("Remove from middle for LinkedList");
        testRemoveFromTheMiddle(new LinkedList<>());
    }

    private static void testAddingInTheEnd(List<Object> list) {
        long startTest, endTest;
        startTest = System.currentTimeMillis();

        for (int i = 0; i <= 500_000; i++) {
            list.add(i);
        }

        endTest = System.currentTimeMillis();
        System.out.println("time is: " + (endTest - startTest) + "ms");
    }

    private static void testAddingInTheBeginning(List<Object> list) {
        long startTest, endTest;
        startTest = System.currentTimeMillis();

        for (int i = 0; i <= 500_000; i++) {
            list.add(0, i);
        }

        endTest = System.currentTimeMillis();
        System.out.println("time is: " + (endTest - startTest) + "ms");
    }

    private static void testAddingInTheMiddle(List<Object> list) {
        long startTest, endTest;
        startTest = System.currentTimeMillis();

        for (int i = 0; i <= 500_000; i++) {
            list.add(list.size()/2, i);
        }

        endTest = System.currentTimeMillis();
        System.out.println("time is: " + (endTest - startTest) + "ms");
    }

    private static void testRemoveFromTheMiddle(List<Object> list) {
        long startTest, endTest;

        for (int i = 0; i <= 500_000; i++) {
            list.add(i);
        }

        startTest = System.currentTimeMillis();

        for (int i = list.size(); i > 0; --i) {
            list.remove(list.size()/2);
        }

        endTest = System.currentTimeMillis();
        System.out.println("time is: " + (endTest - startTest) + "ms");
    }
}
