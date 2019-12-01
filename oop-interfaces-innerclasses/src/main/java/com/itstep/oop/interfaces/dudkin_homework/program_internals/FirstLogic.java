package com.itstep.oop.interfaces.dudkin_homework.program_internals;

public class FirstLogic extends Converter {

    public FirstLogic(String firstString) {
        super(firstString);
        inputStr = result;
        doMainLogic();
    }

    protected void doMainLogic() {
        for (int i = 0; i < inputStr.length; i++) {
            int length = inputStr[i].length() - 2;
            result[i] = inputStr[i].charAt(0) + Integer.toString(length) + inputStr[i].charAt(length + 1);
        }

    }
}
