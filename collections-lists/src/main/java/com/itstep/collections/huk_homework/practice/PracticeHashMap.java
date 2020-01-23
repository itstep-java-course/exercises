package com.itstep.collections.huk_homework.practice;

import java.util.*;

public class PracticeHashMap {


    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(5, "a");
        m.put(4, "b");
        m.put(3, "c");
        m.put(2, "d");
        m.put(1, "e");
        System.out.println(m);


        Map<Integer, String> m1 = new LinkedHashMap<>();

        m1.put(5, "a");
        m1.put(4, "b");
        m1.put(3, "c");
        m1.put(2, "d");
        m1.put(1, "e");
        System.out.println(m1);


        Map<Integer, String> m2 = new LinkedHashMap<>(5, 1, true);
        m2.put(5, "a");
        m2.put(4, "b");
        m2.put(3, "c");
        m2.put(2, "d");
        m2.put(1, "e");

        m2.get(3);
        m2.get(5);
        m2.get(1);
        System.out.println(m2);


        //старые элементы КЕШ будет удалять
        Map<Integer, String> m3 = new SimpleRUCache<Integer, String>(2);
        m3.put(1, "e");
        m3.put(2, "d");
        m3.put(3, "c");

        m3.get(2);

        m3.put(9, "g");
        System.out.println(m3);


        Map<Date, String> m4 = new WeakHashMap<>();
        Date date = new Date(); //какой-то объект
        m4.put(date, "information");

        date = null; //делаем доступным для gc()
        System.gc();

        for (int i = 1; i < 10_000; i++) {
            if (m4.isEmpty()) {
                System.out.println(i);
                System.out.println("Empty!");
                break;
            }
            else {
                System.out.println("Not Empty!");
            }
        }


    }
}

