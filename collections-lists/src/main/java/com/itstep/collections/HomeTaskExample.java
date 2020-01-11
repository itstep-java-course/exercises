package com.itstep.collections;

import com.itstep.collections.arraylist.generics.Car;

import java.util.*;

public class HomeTaskExample {

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

        final List<String> list = new ArrayList<>();
//        list.sort();

        Map<String, Set<Car>> groupedBeColor = new HashMap<>();

    }
}
