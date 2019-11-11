package com.itstep.staticmethod;

import java.util.List;

public class StaticMethodsOverloadExample {
    public static void printWords(String word) {
        System.out.println(word);
    }

    public static void printWords(String word, String word2) {
        System.out.println(word);
        System.out.println(word2);
    }

    public static void printWords(int word, String word2) {

    }

    public static void printWords(String word, int word2) {

    }

    public static void printWords(List<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        StaticMethodsOverloadExample.printWords("hello");
    }
}
