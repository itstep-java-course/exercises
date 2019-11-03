package com.itstep.staticmethod;

public class StaticMethodExample {
    public static void printWord(String word) {
        System.out.println(word);
    }

    public static String getSubstring(String src, int startIndex, int endIndex) {
        return src.substring(startIndex, endIndex);
    }

    public static String getSubstring(String src, int endIndex) {
        return getSubstring(src, 0, endIndex);
    }
}
