package com.itstep.string.array.homeworkDiadiun;

public class Array {
    public static void main(String[] args) {
        String s = "hello_java_world";
        final String[] s2 = s.split("_");
        for (String s1 : s2) {
            final char a = s1.charAt(2);
            final char b = s1.charAt(3);
            System.out.println("2 и 3 буквы " + a + "" + b);
            String result = s1.replace("o", "$");
            System.out.println("Изменения:" + result);

        }
    }
}
