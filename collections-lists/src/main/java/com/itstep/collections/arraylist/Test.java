package com.itstep.collections.arraylist;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        String[] str = new String[]{"2", "3"};
//
//        List<?> rawStr = new ArrayList<>();
//
//        List<String> listStr = new ArrayList<>();
//        listStr.add("str1");
//
//        List listStr1 = new ArrayList();
//        listStr1.add("str1");
//        listStr1.add(new Integer(4));
//
//
//        for (Object o : listStr1) {
//            if (o instanceof Integer) {
//
//            }
//
//            if (o instanceof String) {
//
//            }
//
//        }
//
//
//        String o = (String) listStr1.get(1);


//        for (String s : listStr) {
//            System.out.println(s);
//        }
//
//        Iterator<String> iterator = listStr.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            System.out.println(next);
//        }

        List<String> arrayList = new ArrayList<>(3);
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("1");
        arrayList.add("1");

        //добавление элемента в лист O(1)
        arrayList.add("3");

        //добавление элемента в середину листа O(n)
        arrayList.add(3, "5");

        //перезапись элемента по конкретному индексу O(1)
        arrayList.set(3, "5");

        //проверяет существует ли элемент в листе O(n)
        boolean isExists = arrayList.contains("5");

        //возвращает значение по индексу O(1)
        String s = arrayList.get(4);

        //возвращает индекс элемента в листе O(n)
        int index = arrayList.indexOf("4");

        //удаление элемента из массива по индексу O(n)
        arrayList.remove(4);

        //удаление элемента из массива по значению O(n)
        arrayList.remove("4");

        //количество элементов в листе O(1)
        int size = arrayList.size();

        //возвращает часть листа между индексами. Левый включается а правый нет
        List<String> list = arrayList.subList(4, 6);

        //очищает лист
        arrayList.clear();

        //если лист пустой - true, если нет то false
        boolean empty = arrayList.isEmpty();
    }
}
