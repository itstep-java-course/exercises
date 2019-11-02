package com.itstep.string.array.likhomanov_homework;

public class StringsTaskTwo {

    public static void main(String[] args) {
        String s = "hello_java_world";

        String[] strings = s.split("_");

        for (String string : strings) {
            System.out.println(string);
            System.out.println(string.substring(2, 4));

            if (string.contains("o")) {
                System.out.println(string.replace("o", "$"));
            } else {
                System.out.println("Word doesn't have \"o\"");
            }
        }
    }
}
