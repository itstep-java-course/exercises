package com.itstep.likhomanov_homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Validator {

    private final String password;

    Validator(String password) {
        this.password = password;
    }

    boolean isPasswordValid() throws PasswordNotValidException {
        return  isLongEnough() && hasThreeDigits() && hasSpecialCharacters() && hasCapitalLetters();
    }

    private boolean isLongEnough() throws PasswordNotValidException {
        if (password.length() >= 5 && password.length() <=12) return true;
        else throw new PasswordNotValidException("Password must contain 5 to 12 characters");
    }

    private boolean hasThreeDigits() throws PasswordNotValidException {
        char[] chars = password.toCharArray();
        StringBuilder onlyDigits = new StringBuilder(chars.length);

        for (char c : chars) {
            if (c > 47 && c < 58) {
                onlyDigits.append(c);
            }
        }

        if (onlyDigits.length() > 2) return true;
        else throw new PasswordNotValidException("Password must contain at least three digits");
    }

    private boolean hasSpecialCharacters () throws PasswordNotValidException {
        Pattern pattern = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) return true;
        else throw new PasswordNotValidException("Password must contain at least one special character");
    }

    private boolean hasCapitalLetters() throws PasswordNotValidException {
        char[] chars = password.toCharArray();
        StringBuilder onlyCapitalLetters = new StringBuilder(chars.length);

        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                onlyCapitalLetters.append(c);
            }
        }

        if (onlyCapitalLetters.length() > 0) return true;
        else throw new PasswordNotValidException("Password must contain at least one capital letter");
    }
}
