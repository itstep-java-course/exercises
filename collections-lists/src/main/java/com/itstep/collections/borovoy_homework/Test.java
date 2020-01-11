package com.itstep.collections.borovoy_homework;



public class Test {


    public static void main(String[] args) {
        SimpleList<String> list = new SimpleListImp<>(3);

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");

        if (list.size() != 6) {
            throw new RuntimeException("Size error");
        }

        if (list.isEmpty()) {
            throw new RuntimeException("List must not be empty");
        }

        list.add("seven");

        if (list.size() != 7) {
            throw new RuntimeException("Size error");
        }

        if (!list.contains("four")) {
            throw new RuntimeException("contains error");
        }

        list.remove("four");

        if (list.size() != 6 || list.contains("four")) {
            throw new RuntimeException("Size or contains error");
        }

        String strWithIndex2 = list.get(2);

        if (!strWithIndex2.equals("three")) {
            throw new RuntimeException("get by index error");
        }

        list.add(1, "second");

        if (!list.get(1).equals("second")) {
            throw new RuntimeException("add by index error");
        }

        list.remove(3);

        if (list.contains("three")) {
            throw new RuntimeException("remove by index error");
        }

        int index = list.indexOf("second");

        if (index != 1) {
            throw new RuntimeException("index of error");
        }

        list.clear();

        if (list.size() != 0) {
            throw new RuntimeException("Size error");
        }
    }
}


