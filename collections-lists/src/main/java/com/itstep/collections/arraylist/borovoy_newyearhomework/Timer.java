package com.itstep.collections.arraylist.borovoy_newyearhomework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timer {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Добавление в конец ArrayList");
        final long start = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            arrayList.add(i);
        }
        final long end = System.currentTimeMillis();

        System.out.println("ArrayList добавить в конец. Результат: " + (end - start));

        System.out.println("Добавление в конец LinkedList");
        final long start1 = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            linkedList.add(i);
        }

        final long end1 = System.currentTimeMillis();

        System.out.println("LinkedList добавить в конец. Результат: " + (end1 - start1));

        System.out.println("Добавление в начало ArrayList");
        final long start2 = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            arrayList.add(0, i);
        }
        final long end2 = System.currentTimeMillis();

        System.out.println("ArrayList добавить в начало. Результат: " + (end2 - start2));

        System.out.println("Добавление в начало LinkedList");
        final long start3 = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            linkedList.add(0, i);
        }
        final long end3 = System.currentTimeMillis();

        System.out.println("LinkedList добавить в начало. Результат: " + (end3 - start3));

        System.out.println("Добавление в середину ArrayList");
        final long start4 = System.currentTimeMillis();
        for (int i = 0; i < 200_000; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        final long end4 = System.currentTimeMillis();

        System.out.println("ArrayList добавить в середину. Результат: " + (end4 - start4));

        System.out.println("Добавление в середину LinkedList");
        final long start5 = System.currentTimeMillis();
        for (int i = 0; i < 200_000; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        final long end5 = System.currentTimeMillis();

        System.out.println("LinkedList добавить в середину. Результат: " + (end5 - start5));

        System.out.println("Удаление из середины ArrayList");
        final long start6 = System.currentTimeMillis();
        for (int i = 0; i < 200_000; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        for (int i = 0; i < 200_000; i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        final long end6 = System.currentTimeMillis();

        System.out.println("ArrayList удалить из середины. Результат: " + (end6 - start6));

        System.out.println("Удаление из середины LinkedList");
        final long start7 = System.currentTimeMillis();
        for (int i = 0; i < 200_000; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        for (int i = 0; i < 200_000; i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        final long end7 = System.currentTimeMillis();

        System.out.println("LinkedList удалить из середины. Результат: " + (end7 - start7));

    }

}

