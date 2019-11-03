package com.itstep.string.array.borovoy_homework;

public class StringArraySecondTask {
    public static void main(String[] args) {
        String a = "hello_java_world";
        System.out.println(a);
        final String[] b = a.split("_");
        System.out.println("Spilt:");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println("Substring:");
        for (int i = 0; i < b.length; i++) {
            String c = b[i].substring(1, 3);
            System.out.println(c);
        }
        System.out.println("Replace:");
        for (int i = 0; i < b.length; i++) {
            String r = b[i].replace("o", "$");
            System.out.println(r);
        }

    }
}
