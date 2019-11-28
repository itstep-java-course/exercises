package com.itstep.oop.interfaces.dudkin_homework.program_internals;

import com.itstep.oop.interfaces.dudkin_homework.program_internals.Converter;

class Reverser extends Converter {
    Reverser(String firstString) {
        super(firstString);
        reversedWords = new String[convertedWords.length];
        for (int i = 0; i < reversedWords.length; i++) {
            setReversedWord(i);
        }
    }

    String[] reversedWords;

    private void setReversedWord(int counter) {
        char array1[] = new char[convertedWords[counter].length()];
        for (int i = (convertedWords[counter].length() - 1), j = 0; i >= 0; i--, j++)
            array1[j] = convertedWords[counter].charAt(i);
        reversedWords[counter] = String.valueOf(array1);
    }
}
