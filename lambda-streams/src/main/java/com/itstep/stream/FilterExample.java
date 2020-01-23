package com.itstep.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("name1");
        list.add("name2");
        list.add("name3");
        list.add("name4");
        list.add("name5");

        for (String s : list) {
            if (s.endsWith("3") || s.endsWith("5")) {
                System.out.println(s);
            }
        }

        list.stream()
            .filter(s -> s.endsWith("3") || s.endsWith("5"))
            .forEach(System.out::println);


        List<String> list2 = new ArrayList<>();
        for (String s : list) {
            if (s.endsWith("3") || s.endsWith("5")) {
                list2.add(s);
            }
        }

        final List<String> list2Stream = list.stream()
                                             .filter(s -> s.endsWith("3") || s.endsWith("5"))
                                             .collect(Collectors.toList());

        System.out.println(list2Stream);
    }
}
