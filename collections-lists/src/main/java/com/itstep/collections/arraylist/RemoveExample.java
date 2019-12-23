package com.itstep.collections.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RemoveExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(i);
        }

        new LinkedList<>().descendingIterator();

    }
}
