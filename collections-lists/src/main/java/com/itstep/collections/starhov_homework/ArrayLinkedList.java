package com.itstep.collections.starhov_homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinkedList {
    /*
1. Написать цикл который добавляет элементы в лист. Количество элементов 500_000.
    - замерить время добавления элементов в конец метод add для ArrayList и LinkedList
    - замерить время добавления элементов в начало метод add(0, element) для ArrayList и LinkedList
    - замерить время добавления элементов в середину метод add(200_000, element) для ArrayList и LinkedList
    - замерить время удаления элемента из середины метод remove(200_000) для ArrayList и LinkedList
 */
    public static void main(String[] args){
        System.out.println("добадение в конец arraylist");
        List<Integer> arraylist = new ArrayList<>();
        List<Integer> linkedlist = new LinkedList<>();
        final long startTimeArraylist=System.currentTimeMillis();
        for (int i = 0; i <500000 ; i++) {
            arraylist.add(i);
        }
        final long endTimeArraulist = System.currentTimeMillis();
        System.out.println("результат добавления в конец."+ (endTimeArraulist-startTimeArraylist)+"ms");

        System.out.println("анологично добавление в конец LinkedList");
        final long startTimeLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) { //заполнение linkedList индексами
            linkedlist.add(i);
        }
        final long endTimeLinkedList = System.currentTimeMillis();
        System.out.println("Linkedlist. Результат добавления в конец. " + (endTimeLinkedList - startTimeLinkedList) + " ms");

        System.out.println("//////////////////////////////////////////////////////////////////////////////");

        System.out.println("Добавление элементов в начало,  ArrayList");
        final long startTimeArrayList2 = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            arraylist.add(0, i);
        }
        final long endTimeArrayList2 = System.currentTimeMillis();
        System.out.println("ArrayList, результат добавления в начало  " + (endTimeArrayList2 - startTimeArrayList2) + " ms");


        System.out.println("Добавление элементов в начало LinkedList");
        final long startTimeLinkedList2 = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            linkedlist.add(0, i);
        }
        final long endTimeLinkedList2 = System.currentTimeMillis();
        System.out.println("LinkedList, результат добавления в начало " + (endTimeLinkedList2 - startTimeLinkedList2) + " ms");

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");

        System.out.println("Добавление элементов в середину ArrayList");
        final long startTimeArrayList3 = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            arraylist.add(arraylist.size()/2, i);
        }
        final long endTimeArrayList3 = System.currentTimeMillis();
        System.out.println("ArrayList результат добавления в середину " + (endTimeArrayList3 - startTimeArrayList3) + " ms");


        System.out.println("Добавление элементов в середину LinkedList");
        final long startTimeLinkedList4 = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            linkedlist.add(linkedlist.size()/2, i);
        }
        final long endTimeLinkedList4 = System.currentTimeMillis();
        System.out.println("LinkedList результат добавления в середину  " + (endTimeLinkedList4 - startTimeLinkedList4) + " ms");

        System.out.println("=========================================================================================");

        System.out.println("Удаление элементов из середины ArrayList");
        for (int i = 0; i < 200000; i++) { //заполнение arrayList индексами
            arraylist.add(i);
        }
        final long startTimeArrayList5 = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            arraylist.remove(arraylist.size()/2);
        }
        final long endTimeArrayList5 = System.currentTimeMillis();
        System.out.println("Array List резуьтат удаления из середины " + (endTimeArrayList5 - startTimeArrayList5) + " ms");


        System.out.println("Удаление элементов из середины Linked List");
        for (int i = 0; i < 200000; i++) { //заполнение linkedList индексами
            linkedlist.add(i);
        }
        final long startTimeLinkedList6 = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            linkedlist.remove(linkedlist.size()/2);
        }
        final long endTimeLinkedList6 = System.currentTimeMillis();
        System.out.println("Linked List, резуьтат удаления из середины " + (endTimeLinkedList6 - startTimeLinkedList6) + " ms");

    }

}
