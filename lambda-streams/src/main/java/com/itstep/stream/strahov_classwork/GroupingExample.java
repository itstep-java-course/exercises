package com.itstep.stream.strahov_classwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample {
    public static void main (String args[]){
        List <String> list  = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        list.add("a4");
        list.add("a2");
        list.add("a5");
        list.add("a1");
        list.add("a4");
       final Map<String, List<String>> stringListMap = groupElements(list);

        System.out.println(stringListMap);
        //after java 8
        final Map<String, List<String>> map = list.stream()
                                                   .collect(Collectors.groupingBy(e ->e));
        System.out.println(map);
        //group user example


    }
     public static Map<String, List<String>> groupElements(List<String> list){
        Map <String, List<String>> map=new HashMap<>();
         for (int i=0;i<list.size();i++ ){
             if(map.get(list.get(i))==null){
                 List<String> strings  =new ArrayList<>();
                 strings.add(list.get(i));
                 map.put(list.get(i),strings);
                 // находим елемент и создаем новый лист в который будем записывать елемент и добавляем в мапу по ключу
             } else {
                 map.get(list.get(i)).add(list.get(i));
                 //просим вернуть мапу елемент и записать его в лист
             }
         }


        return map;
     }
     private class User{
        private final String name;
        private final Integer age;

         private User(String name, Integer age) {
             this.name = name;
             this.age = age;
         }
     }
}
