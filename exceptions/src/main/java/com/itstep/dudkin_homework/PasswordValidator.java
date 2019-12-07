package com.itstep.dudkin_homework;

public class PasswordValidator {
    private char[] symbols;

    PasswordValidator(String password) throws CustomExceptions {
        symbols = password.toCharArray();
        if (!(normalLength() && have3numbers() && haveCapitalLetter() && haveSpecialSymbol()))
            throw new CustomExceptions();
        System.out.println("Everything is all right!");
    }

    private boolean normalLength() {
        if (symbols.length < 12)
            return true;
        return false;
    }

    private boolean haveCapitalLetter() {
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] > 64 & symbols[i] < 91)
                return true;
        }
        return false;
    }

    private boolean haveSpecialSymbol() {
        int counter = symbols.length;
        for (int i = 0; i < symbols.length; i++) {
            if ((symbols[i] > 64 & symbols[i] < 91) || (symbols[i] > 47 & symbols[i] < 58) || (symbols[i] > 96 & symbols[i] < 123))
                counter--;
        }
        if (counter > 0)
            return true;
        return false;
    }

    private boolean have3numbers() {
        int counter = 0;
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] > 47 & symbols[i] < 58)
                counter++;
        }
        if (counter > 2)
            return true;
        return false;
    }
}
