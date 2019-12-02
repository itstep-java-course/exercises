package com.itstep.oop.interfaces.dudkin_homework.program_internals;

import com.itstep.oop.interfaces.dudkin_homework.program_internals.Converter;

public class Reverser extends Converter {
    public Reverser(String firstString) {
        super(firstString);
        inputStr = result;
        for (; i < inputStr.length; i++) {
            doReverse();
        }
    }

    int i = 0;

    protected void doReverse() {
        char array1[] = new char[inputStr[i].length()];
        for (int l = (inputStr[i].length() - 1), j = 0; l >= 0; l--, j++)
            array1[j] = inputStr[i].charAt(l);
        result[i] = String.valueOf(array1);

    }
}
