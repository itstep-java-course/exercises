package com.itstep.collections.hashset.likhomanov_homework.timing_comparison;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListTimingTest {

    public static void main(String[] args) {

        //16 ms
        System.out.println("Add-in-the-end timing for ArrayList");
        testAdding(new ArrayList<>());

        //66 ms
        System.out.println("Add-in-the-end timing for LinkedList");
        testAdding(new LinkedList<>());

        //27130 ms
        System.out.println("Add-in-the-beginning timing for ArrayList");
        testAddingInTheBeginning(new ArrayList<>());

        //66 ms
        System.out.println("Add-in-the-beginning timing for LinkedList");
        testAddingInTheBeginning(new LinkedList<>());

        //20029 ms
        System.out.println("Add-in-the-beginning-when-half-full timing for ArrayList");
        testAddingInTheBeginningHalfFull(new ArrayList<>());

        //4 ms
        System.out.println("Add-in-the-beginning-when-half-full timing for LinkedList");
        testAddingInTheBeginningHalfFull(new LinkedList<>());

        //12581 ms
        System.out.println("Add-in-the-middle timing for ArrayList");
        testAddingInTheMiddle(new ArrayList<>());

        //369240 ms
        System.out.println("Add-in-the-middle timing for LinkedList");
        testAddingInTheMiddle(new LinkedList<>());

        //12405 ms
        System.out.println("Remove-from-the-middle timing for ArrayList");
        testRemovingFromTheMiddle(new ArrayList<>());

        //162987 ms
        System.out.println("Remove-from-the-middle timing for LinkedList");
        testRemovingFromTheMiddle(new LinkedList<>());
    }

    private static void testAdding(List<Object> list) {
        long start, end;

        start = System.currentTimeMillis();

        for (int i = 0; i <= 500_000; ++i) {
            list.add(new Object());
        }

        end = System.currentTimeMillis();

        calculateAndShow(start, end);
    }

    private static void testAddingInTheBeginning(List<Object> list) {
        long start, end;

        start = System.currentTimeMillis();

        for (int i = 0; i <= 500_000; ++i) {
            list.add(0, new Object());
        }

        end = System.currentTimeMillis();

        calculateAndShow(start, end);
    }

    private static void testAddingInTheBeginningHalfFull(List<Object> list) {
        long start, end;

        for (int i = 0; i <= 250_000; ++i) {
            list.add(new Object());
        }

        start = System.currentTimeMillis();

        for (int i = 0; i <= 250_000; ++i) {
            list.add(0, new Object());
        }

        end = System.currentTimeMillis();

        calculateAndShow(start, end);
    }

    private static void testAddingInTheMiddle(List<Object> list) {
        long start, end;

        start = System.currentTimeMillis();

        for (int i = 0; i <= 500_000; ++i) {
            list.add((list.size() >> 1), new Object());
        }

        end = System.currentTimeMillis();

        calculateAndShow(start, end);
    }

    private static void testRemovingFromTheMiddle(List<Object> list) {
        long start, end;

        for (int i = 0; i <= 500_000; ++i) {
            list.add(new Object());
        }

        start = System.currentTimeMillis();

        for (int i = list.size(); i > 0; --i) {
            list.remove((list.size() >> 1));
        }

        end = System.currentTimeMillis();

        calculateAndShow(start, end);
    }

    private static void calculateAndShow(long start, long end) {
        System.out.println("Operation took: " + (end - start) + " ms");
        System.out.println("------//------//------//------//------//------");
    }
}
