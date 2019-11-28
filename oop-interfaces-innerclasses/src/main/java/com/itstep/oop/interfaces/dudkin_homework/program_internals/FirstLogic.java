package com.itstep.oop.interfaces.dudkin_homework.program_internals;

class FirstLogic extends Converter {

    FirstLogic(String firstString) {
        super(firstString);
        result = new String[convertedWords.length];
        doFirstLogic();
    }

    String[] result;

    private void doFirstLogic() {
        for (int i = 0; i < result.length; i++) {
            int length = convertedWords[i].length() - 2;
            result[i] = convertedWords[i].charAt(0) + Integer.toString(length) + convertedWords[i].charAt(length + 1);
        }
    }
}
