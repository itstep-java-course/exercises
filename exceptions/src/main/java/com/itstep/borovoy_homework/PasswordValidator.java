package com.itstep.borovoy_homework;

import static java.lang.Character.isDigit;

public class PasswordValidator implements CapitalLetterCheckable, LengthCheckable,
        SymbolCheckable, ThreeNumeralCheckable {
    private final String password;

    PasswordValidator(String password) {
        this.password = password;
    }

    boolean isPasswordValid() throws InvalidPasswordException {
        return hasCapitalLetter() && hasSpecialSymbol() &&
                hasThreeNumeral() && hasCorrectLength();
    }

    @Override
    public boolean hasThreeNumeral() throws InvalidPasswordException {
        char[] passwordInChars = password.toCharArray();
        int counter = 0;
        for (char passwordChar : passwordInChars) {
            if (isDigit(passwordChar))
                counter++;
        }
        if (counter > 2)

            return true;
        throw new InvalidPasswordException("Password must contains at least three numerals");
    }


    @Override
    public boolean hasCapitalLetter() throws InvalidPasswordException {

        char[] currentCharacter = password.toCharArray();
        for (char passwordChar : currentCharacter) {
            if (Character.isUpperCase(passwordChar))
                return true;
        }
        throw new InvalidPasswordException("Password must contains a capital letter");

    }

    @Override
    public boolean hasCorrectLength() throws InvalidPasswordException {
        if (password.length() > 5 && password.length() <= 12) {
            return true;
        }
        throw new InvalidPasswordException("Password length must be between 5 and 12 symbols");
    }

    @Override
    public boolean hasSpecialSymbol() throws InvalidPasswordException {
        String symbol = "_";
        if (password.contains("_") || password.contains(".") || password.contains("/")
                && password.contains("$") || password.contains("%")) {
            return true;
        }
        throw new InvalidPasswordException("Password must contains at least 1 symbol");
    }
}

