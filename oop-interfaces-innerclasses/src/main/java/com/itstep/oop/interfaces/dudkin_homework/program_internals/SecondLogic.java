package com.itstep.oop.interfaces.dudkin_homework.program_internals;

import com.itstep.oop.interfaces.dudkin_homework.program_internals.Converter;

public class SecondLogic extends Converter {
    public SecondLogic(String firstString) {
        super(firstString);
        inputStr = result;
        for (; i < inputStr.length; i++) {
            doMainLogic();
        }
    }

    int i = 0;

    @Override
    protected void doMainLogic() {
        char array1[] = new char[inputStr[i].length()];
        for (int l = (inputStr[i].length() - 1), j = 0; l >= 0; l--, j++)
            array1[j] = inputStr[i].charAt(l);
        result[i] = String.valueOf(array1);

    }
}
