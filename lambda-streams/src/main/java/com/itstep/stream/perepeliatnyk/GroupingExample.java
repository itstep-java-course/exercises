package com.itstep.stream.perepeliatnyk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
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

        final Map<String, List<String>> groupElements = groupElements(list);

        System.out.println(groupElements);

        final Map<String, List<String>> map = list.stream()
                .collect(Collectors.groupingBy(e -> e));
        System.out.println(map);

        List<User> users = new ArrayList<>();
        users.add(new User("Strahov", 19));
        users.add(new User("Huk", 30));
        users.add(new User("Lihomanov", 35));
        users.add(new User("Perepeliatnyk", 35));
        users.add(new User("Shnurenko", 30));
        users.add(new User("Borovoy", 17));

        final Map<Integer, List<User>> groupUsers = groupUsers(users);

        System.out.println(groupUsers);

        final Map<Integer, List<User>> collect = users.stream()
                .collect(Collectors.groupingBy(user -> user.getAge()));

    }

    private static Map<Integer, List<User>> groupUsers(List<User> input) {
        Map<Integer, List<User>> elementsMap = new HashMap<>();
        for (User s : input) {
            final List<User> list = elementsMap.get(s.getAge());
            if (list == null) {
                List<User> newList = new ArrayList<>();
                newList.add(s);
                elementsMap.put(s.getAge(), newList);
            } else {
                list.add(s);
            }

        }
        return elementsMap;

        //
//    private static Map<String, List<String>> groupElements(List<String> list) {
//        Map<String, List<String>> map = new HashMap<>();
//        for (String string : list) {
//            if (map.get(string) == null) {
//                List<String> strings = new ArrayList<>();
//                strings.add(string);
//                map.put(string, strings);
//            } else {
//                map.get(string).add(string);
//            }
//
//        }
//        return map;
//
//    }


    }

    private static Map<String, List<String>> groupElements(List<String> input) {
        Map<String, List<String>> elementsMap = new HashMap<>();
        for (String s : input) {
            final List<String> list = elementsMap.get(s);
            if (list == null) {
                List<String> newList = new ArrayList<>();
                newList.add(s);
                elementsMap.put(s, newList);
            } else {
                list.add(s);
            }

        }
        return elementsMap;

    }

    public static class User {
        private final String name;
        private final Integer age;

        public User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public Integer getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}