package com.itstep.collections.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("0dsfsf");
        hashSet.add("1df");
        hashSet.add("2aasasas");
        hashSet.add("3dsds");
        hashSet.add("4aaaaaaaa");
        hashSet.add("5dddd");
        hashSet.add("6aaaa");


        for (String s1 : hashSet) {
            System.out.println(s1);
        }


        System.out.println("==========/==========/==========/==========/==========");
        System.out.println("linked hash set");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("0dsfsf");
        linkedHashSet.add("1df");
        linkedHashSet.add("2aasasas");
        linkedHashSet.add("3dsds");
        linkedHashSet.add("4aaaaaaaa");
        linkedHashSet.add("5dddd");
        linkedHashSet.add("6aaaa");

        for (String s1 : linkedHashSet) {
            System.out.println(s1);
        }




    }
}
