package com.itstep.collections.dudkin_hometask;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Comparator {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList добавлет в конец за " + (double) (end - start) / 1000 + "(c)");
        start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            linkedList.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList добавлет в конец за " + (double) (end - start) / 1000 + "(c)");
        linkedList.clear();arrayList.clear();
        System.out.println("==========================================================================");
        start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            arrayList.add(0,i);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList добавлет в начало за " + (double) (end - start) / 1000 + "(c)");
        start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            linkedList.add(0,i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList добавлет в начало за " + (double) (end - start) / 1000 + "(c)");
        linkedList.clear();arrayList.clear();
        System.out.println("==========================================================================");
        start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            arrayList.add(arrayList.size()/2,i);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList добавлет в середину за " + (double) (end - start) / 1000 + "(c)");
        start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            linkedList.add(linkedList.size()/2,i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList добавлет в середину за " + (double) (end - start) / 1000 + "(c)");
        System.out.println("==========================================================================");
        start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            arrayList.remove(arrayList.size()/2);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList удаляет из середины за " + (double) (end - start) / 1000 + "(c)");
        start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            linkedList.remove(linkedList.size()/2);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList удаляет из середины за  " + (double) (end - start) / 1000 + "(c)");
    }
}
