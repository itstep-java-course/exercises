package com.itstep.staticmethod;

public class StaticMethodExample {
    public static void printWord(String word) {
        System.out.println(word);
    }

    public static String getSubstring(String src, int startIndex, int endIndex) {
        String substring = src.substring(startIndex, endIndex);
        return substring;
    }

    public static void main(String[] args) {
        String value = StaticMethodExample.getSubstring("value", 1, 3);

        System.out.println(value);

    }

//    public static String getSubstring(String src, int endIndex) {
//        return getSubstring(src, 0, endIndex);
//    }
}
