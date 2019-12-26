package com.itstep.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);

            if (i == 50) {
                for (Integer integer : list) {
                    list.remove(integer);
                }
            }
        }
    }
}
