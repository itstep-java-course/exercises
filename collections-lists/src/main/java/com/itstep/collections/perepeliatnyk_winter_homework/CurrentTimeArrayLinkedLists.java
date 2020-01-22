package com.itstep.collections.perepeliatnyk_winter_homework;

import java.sql.SQLOutput;
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

public class CurrentTimeArrayLinkedLists {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Добавление в конец методом add ArrayList");
        final long startTimeArrayList = System.currentTimeMillis();
        for (int i = 0; i < 500_000 ; i++) {
            arrayList.add(i);
        }
        final long endTimeArrayList = System.currentTimeMillis();
        System.out.println("Результат по времени: " + (endTimeArrayList - startTimeArrayList) + "ms");

        System.out.println("________________________________________________________________________");

        System.out.println("Добавление в конец методом add LinkedList");
        final long startTimeLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 500_000 ; i++) {
            linkedList.add(i);
        }
        final long endTimeLinkedList = System.currentTimeMillis();
        System.out.println("Результат по времени: " + (endTimeLinkedList - startTimeLinkedList) + "ms");

        System.out.println("________________________________________________________________________");

        System.out.println("Добавление в начало методом add ArrayList");
        final long startTimeArrayList1 = System.currentTimeMillis();
        for (int i = 0; i < 500_000 ; i++) {
            arrayList.add(0, i);
        }
        final long endTimeArrayList1 = System.currentTimeMillis();
        System.out.println("Результат по времени: " + (endTimeArrayList1 - startTimeArrayList1) + "ms");

        System.out.println("________________________________________________________________________");

        System.out.println("Добавление в начало методом add LinkedList");
        final long startTimeLinkedList1 = System.currentTimeMillis();
        for (int i = 0; i < 500_000 ; i++) {
            linkedList.add(0, i);
        }
        final long endTimeLinkedList1 = System.currentTimeMillis();
        System.out.println("Результат по времени: " + (endTimeLinkedList1 - startTimeLinkedList1) + "ms");

        System.out.println("________________________________________________________________________");

        System.out.println("Добавление в середину методом add ArrayList");
        final long startTimeArrayList2 = System.currentTimeMillis();
        for (int i = 0; i < 200_000 ; i++) {
            arrayList.add(arrayList.size()/2, i);
        }
        final long endTimeArrayList2 = System.currentTimeMillis();
        System.out.println("Результат по времени: " + (endTimeArrayList2 - startTimeArrayList2) + "ms");

        System.out.println("________________________________________________________________________");

        System.out.println("Добавление в середину методом add LinkedList");
        final long startTimeLinkedList2 = System.currentTimeMillis();
        for (int i = 0; i < 200_000 ; i++) {
            linkedList.add(linkedList.size()/2, i);
        }
        final long endTimeLinkedList2 = System.currentTimeMillis();
        System.out.println("Результат по времени: " + (endTimeLinkedList2 - startTimeLinkedList2) + "ms");

        System.out.println("________________________________________________________________________");

        System.out.println("Удаление из середины методом remove ArrayList");
        for (int i = 0; i < 200_000 ; i++) {
            arrayList.add(i);
        }
        final long startTimeArrayList3 = System.currentTimeMillis();
        for (int i = 0; i < 200_000 ; i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        final long endTimeArrayList3 = System.currentTimeMillis();
        System.out.println("Результат по времени: " + (endTimeArrayList3 - startTimeArrayList3) + "ms");

        System.out.println("________________________________________________________________________");

        System.out.println("Удаление из середины методом remove LinkedList");
        for (int i = 0; i < 200_000 ; i++) {
            linkedList.add(i);
        }
        final long startTimeLinkedList3 = System.currentTimeMillis();
        for (int i = 0; i < 200_000 ; i++) {
            linkedList.remove(linkedList.size()/2);
        }
        final long endTimeLinkedList3 = System.currentTimeMillis();
        System.out.println("Результат по времени: " + (endTimeLinkedList3 - startTimeLinkedList3) + "ms");

        System.out.println("________________________________________________________________________");
    }

}
