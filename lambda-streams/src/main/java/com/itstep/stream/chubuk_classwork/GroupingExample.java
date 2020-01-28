package com.itstep.stream.chubuk_classwork;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        list.add("a4");
        list.add("a2");
        list.add("a5");
        list.add("a1");
        list.add("a4");

        final Map<String, List<String>> map = list.stream()
                .collect(Collectors.groupingBy(e -> e));
        System.out.println(map);

//        final Map<String, List<String>> stringListMap = groupElements(list);
//        System.out.println(stringListMap);
    }

//    public static Map<String, List<String>> groupElements(List<String> list){
//        Map<String, List<String>> map = new HashMap<>();
    //           for (int i = 0; i < list.size(); i++) {
    //              if (map.get(list.get(i)) == null) {
    //                List<String> strings = new ArrayList<>();
    //          strings.add(list.get(i));
    //        map.put(list.get(i), strings);
    //      }
    //    else map.get(list.get(i)).add(list.get(i));
    // }
    //return map;
    //}

    private static class User {
        private final String name;
        private final int age;

        private User(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
