package com.itstep.collections.arraylist;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] str = new String[]{"2", "3"};

        List<?> rawStr = new ArrayList<>();

        List<String> listStr = new ArrayList<>();
        listStr.add("str1");

        List listStr1 = new ArrayList();
        listStr1.add("str1");
        listStr1.add(new Integer(4));


        for (Object o : listStr1) {
            if (o instanceof Integer) {

            }

            if (o instanceof String) {

            }

        }


        String o = (String) listStr1.get(1);


//        for (String s : listStr) {
//            System.out.println(s);
//        }
//
//        Iterator<String> iterator = listStr.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            System.out.println(next);
//        }
    }
}
