package com.itstep.oop.interfaces.dudkin_homework.program_internals;

abstract class Converter implements MainInterface {
    String[] result;
    String[] inputStr;

    Converter(String firstString) {
        String[] unconvertedWords = firstString.split(",|-| ");
        int j = 0;
        for (int i = 0; i < unconvertedWords.length; i++) {
            if (unconvertedWords[i].isEmpty())
                j++;
        }
        result = new String[unconvertedWords.length - j];
        for (int i = 0, counter = 0; i < unconvertedWords.length; i++) {
            if (!unconvertedWords[i].isEmpty()) {
                result[counter] = unconvertedWords[i];
                counter++;
            }
        }
    }

    public void show() {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}