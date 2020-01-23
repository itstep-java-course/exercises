package com.itstep.collections.huk_homework;

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

public class CurrentTimeArrayListLinkedList {


    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Добавление элементов в конец, метод add, ArrayList");
        final long startTimeArrayList = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) { //заполнение arrayList индексами
            arrayList.add(i);
        }
        final long endTimeArrayList = System.currentTimeMillis();
        System.out.println("ArrayList, метод add, добавление в конец. Результат: " + (endTimeArrayList - startTimeArrayList) + " ms");


        System.out.println("Добавление элементов в конец, метод add, LinkedList");
        final long startTimeLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) { //заполнение linkedList индексами
            linkedList.add(i);
        }
        final long endTimeLinkedList = System.currentTimeMillis();
        System.out.println("LinkedList, метод add, добавление в конец. Результат: " + (endTimeLinkedList - startTimeLinkedList) + " ms");

        System.out.println("=========================================================================================");

        System.out.println("Добавление элементов в начало, метод add(0, element), ArrayList");
        final long startTimeArrayList2 = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            arrayList.add(0, i);
        }
        final long endTimeArrayList2 = System.currentTimeMillis();
        System.out.println("ArrayList, метод add, добавление в начало. Результат: " + (endTimeArrayList2 - startTimeArrayList2) + " ms");


        System.out.println("Добавление элементов в начало, метод add(0, element), LinkedList");
        final long startTimeLinkedList2 = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            linkedList.add(0, i);
        }
        final long endTimeLinkedList2 = System.currentTimeMillis();
        System.out.println("LinkedList, метод add, добавление в начало. Результат: " + (endTimeLinkedList2 - startTimeLinkedList2) + " ms");

        System.out.println("=========================================================================================");

        System.out.println("Добавление элементов в середину, метод add(200, element), ArrayList");
        final long startTimeArrayList3 = System.currentTimeMillis();
        for (int i = 0; i < 200_000; i++) {
            arrayList.add(arrayList.size()/2, i);
        }
        final long endTimeArrayList3 = System.currentTimeMillis();
        System.out.println("ArrayList, метод add, добавление в середину. Результат: " + (endTimeArrayList3 - startTimeArrayList3) + " ms");


        System.out.println("Добавление элементов в середину, метод add(200, element), LinkedList");
        final long startTimeLinkedList4 = System.currentTimeMillis();
        for (int i = 0; i < 200_000; i++) {
            linkedList.add(linkedList.size()/2, i);
        }
        final long endTimeLinkedList4 = System.currentTimeMillis();
        System.out.println("LinkedList, метод add, добавление в середину. Результат: " + (endTimeLinkedList4 - startTimeLinkedList4) + " ms");

        System.out.println("=========================================================================================");

        System.out.println("Удаление элементов из середины, метод remove(200), ArrayList");
        for (int i = 0; i < 200_000; i++) { //заполнение arrayList индексами
            arrayList.add(i);
        }
        final long startTimeArrayList5 = System.currentTimeMillis();
        for (int i = 0; i < 200_000; i++) {
            arrayList.remove(arrayList.size()/2);
        }
        final long endTimeArrayList5 = System.currentTimeMillis();
        System.out.println("ArrayList, метод remove, удаление из середины. Результат: " + (endTimeArrayList5 - startTimeArrayList5) + " ms");


        System.out.println("Удаление элементов из середины, метод remove(200), LinkedList");
        for (int i = 0; i < 200_000; i++) { //заполнение linkedList индексами
            linkedList.add(i);
        }
        final long startTimeLinkedList6 = System.currentTimeMillis();
        for (int i = 0; i < 200_000; i++) {
            linkedList.remove(linkedList.size()/2);
        }
        final long endTimeLinkedList6 = System.currentTimeMillis();
        System.out.println("LinkedList, метод remove, удаление из середины. Результат: " + (endTimeLinkedList6 - startTimeLinkedList6) + " ms");

    }
}
