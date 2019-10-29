package com.itstep.string.array.likhomanov_classwork;

public class StringExample {

    public static void main(String[] args) {
        String s = "value";
        /*Метды класса String*/
        //equals
        if (s.equals("value")) {
            System.out.println("Strings are the same");
        } else {
            System.out.println("Strings are not the same");
        }

        //equalsIgnoreCase
        if (s.equalsIgnoreCase("VALUE")) {
            System.out.println("Strings are the same");
        } else {
            System.out.println("Strings are not the same");
        }

        //contains
        if (s.contains("val")) {
            System.out.println("String contains val");
        } else {
            System.out.println("String doesn't contain val");
        }

        //substring
        String result = s.substring(2, 4);
        System.out.println(result);
        result = s.substring(3);
        System.out.println(result);

        //endsWith
        if (s.endsWith("e")) {
            System.out.println("String ends with e");
        } else {
            System.out.println("String doesn't end with e");
        }

        //startsWith
        if (s.startsWith("v")) {
            System.out.println("String starts with v");
        } else {
            System.out.println("String doesn't start with e");
        }

        //isEmpty
        if (s.isEmpty()) {
            System.out.println("String is empty");
        } else {
            System.out.println("String is not empty");
        }

        //replace
        String result1 = s.replace("val", "xxx");
        System.out.println(result1);

        //indexOf
        int index = s.indexOf("l"); //до первого совпадения
        System.out.println(index);

        //intern - принудительно добавить в String Pool
        String someString = new String("qwerty"); // не добавилась в String Pool
        someString.intern();

        //charAt
        char ch = s.charAt(2);
        System.out.println(ch);

        //length
        System.out.println(s.length());

        //toCharArray
        char[] chArray = s.toCharArray();

        //split
        String s2 = "value_value_value";
        String[] strings = s2.split("_");
        System.out.println(strings);
    }
}
