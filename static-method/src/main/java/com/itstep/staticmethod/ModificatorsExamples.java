package com.itstep.staticmethod;

import java.util.List;

public class ModificatorsExamples {

    //метод может быть использован только внутри класса StaticMethodsAggregator
    private static void printWords(List<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    //метод может быть использован только внутри пакета com.itstep.staticmethod
    static void printWordsWithLengthMoreThen2(List<String> words) {
        for (String word : words) {
            if (word.length() > 2) {
                System.out.println(word);
            }
        }
    }

    //метод может быть использован только внутри пакета com.itstep.staticmethod и в классах наследниках
    protected static void printWordsWithLengthMoreThen3(List<String> words) {
        for (String word : words) {
            if (word.length() > 3) {
                System.out.println(word);
            }
        }
    }

    //метод может быть использован в любом месте программы
    public static void printWordsWithLengthMoreThen4(List<String> words) {
        for (String word : words) {
            if (word.length() > 4) {
                System.out.println(word);
            }
        }
    }
}
