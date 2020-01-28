package com.itstep.stream.huk_classwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample {

    static Map <String, List<String>> groupElements(List<String> input) {
        Map<String, List<String>> elementsMap = new HashMap<String, List<String>>();
        for (String s : input) {
            final List<String> list = elementsMap.get(s);
            if (list == null) {
                List<String> newList = new ArrayList<>();
                newList.add(s);
                elementsMap.put(s, newList);
            } else
                list.add(s);
        }
        return elementsMap;
    }

    static Map <Integer, List<User>> groupElements1 (List<User> input) {
        Map<Integer, List<User>> elementsMap = new HashMap<>();
        for (User s : input) {
            final List<User> list = elementsMap.get(s.getAge());
            if (list == null) {
                List<User> newList = new ArrayList<>();
                newList.add(s);
                elementsMap.put(s.getAge(), newList);
            } else
                list.add(s);
        }
        return elementsMap;
    }




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


        // old school
        final Map<String, List<String>> groupedElements = groupElements(list);
        System.out.println(groupedElements);

        //after java8
        final Map<String, List<String>> map = list.stream()
                .collect(Collectors.groupingBy(e->e));
        System.out.println(map);

        //group user example
        List<User> users = new ArrayList<>();
        users.add(new User ("Strahov1", 12));
        users.add(new User ("Strahov2", 23));
        users.add(new User ("Strahov3", 12));
        users.add(new User ("Strahov4", 22));
        users.add(new User ("Strahov5", 12));
        users.add(new User ("Strahov6", 30));
        System.out.println(groupedElements);

        // group user example java8
        final Map<Integer, List<User>> collect = users.stream().collect(Collectors.groupingBy(User::getAge));

        System.out.println(collect);

    }

    private  static class User{
        private final String name;
        private final Integer age;

        private User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
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
