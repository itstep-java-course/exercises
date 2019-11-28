package com.itstep.oop.interfaces.dudkin_homework.program_internals;

public interface MainInterface {
    default void showResultOfRevers(String inputString) {
        Reverser words = new Reverser(inputString);
        for (int i = 0; i < words.reversedWords.length; i++) {
            System.out.println(words.reversedWords[i]);
        }
    }

    default void showResultOfReversWithLimit(String inputString) {
        Reverser words = new Reverser(inputString);
        for (int i = 0; i < words.reversedWords.length; i++) {
            if (words.reversedWords[i].length() > 6)
                System.out.println(words.reversedWords[i]);
        }
    }

    default void showResultOfFirstLogic(String inputString) {
        FirstLogic words = new FirstLogic(inputString);
        for (int i = 0; i < words.result.length; i++) {
            System.out.println(words.result[i]);
        }
    }

}
