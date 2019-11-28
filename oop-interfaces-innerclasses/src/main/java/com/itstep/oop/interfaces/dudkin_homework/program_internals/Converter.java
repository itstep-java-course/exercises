package com.itstep.oop.interfaces.dudkin_homework.program_internals;

public abstract class Converter {
    String[] convertedWords;

    Converter(String firstString) {
        String[] unconvertedWords = firstString.split(",|-| ");
        int j = 0;
        for (int i = 0; i < unconvertedWords.length; i++) {
            if (unconvertedWords[i].isEmpty())
                j++;
        }
        convertedWords = new String[unconvertedWords.length - j];
        for (int i = 0, counter = 0; i < unconvertedWords.length; i++) {
            if (!unconvertedWords[i].isEmpty()) {
                convertedWords[counter] = unconvertedWords[i];
                counter++;
            }
        }
    }
}
