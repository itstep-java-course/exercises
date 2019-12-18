package com.itstep.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        //добавление элемента в лист O(1)
        linkedList.add("3");

        //добавление элемента в середину листа O(n)
        linkedList.add(3, "5");

        //перезапись элемента по конкретному индексу O(n)
        linkedList.set(3, "5");

        //проверяет существует ли элемент в листе O(n)
        boolean isExists = linkedList.contains("5");

        //возвращает значение по индексу O(n)
        String s = linkedList.get(4);

        //возвращает индекс элемента в листе O(n)
        int index = linkedList.indexOf("4");

        //удаление элемента из массива по индексу O(n)
        linkedList.remove(4);

        //удаление элемента из массива по значению O(n)
        linkedList.remove("4");

        //количество элементов в листе O(1)
        int size = linkedList.size();

        //возвращает часть листа между индексами. Левый включается а правый нет
        List<String> list = linkedList.subList(4, 6);

        //очищает лист
        linkedList.clear();

        //если лист пустой - true, если нет то false
        boolean empty = linkedList.isEmpty();







//        String thirdElement = ll.get(3);
//
//        LinkedList<String> linkedList = new LinkedList<>();
//
//        Stack<String> s = new Stack<>();
//
//        PriorityQueue<String> sp = new PriorityQueue<>();
//        sp.


    }
}
