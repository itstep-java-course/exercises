package com.itstep.shyrkov_homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    private final String password;

    public PasswordValidator(String password) {
        this.password = password;
    }

    public boolean isPasswordValid() throws InvalidPasswordException{
        return hasUpRegLetter()&&hasSpecialSymbol()&&hasThreeDigits()&&isCorrectLength();
    }

    private boolean hasUpRegLetter() throws InvalidPasswordException {
        char[] passwordInChars = password.toCharArray();
        for (char passwordChar : passwordInChars) {
            if (Character.isUpperCase(passwordChar))
                return true;
        }
        throw new InvalidPasswordException("Password must contain at least 1 capital letter");
    }

    private boolean hasSpecialSymbol() throws InvalidPasswordException {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(password);

        if (matcher.find())
            return true;
        else
            throw new InvalidPasswordException("Password must contain at least 1 special character");
    }

    private boolean hasThreeDigits() throws InvalidPasswordException{
        char[] passwordInChars = password.toCharArray();
        int digitCounter = 0;
        for (char passwordChar : passwordInChars) {
            if(isDigit(passwordChar))
                digitCounter++;
        }
        if(digitCounter>=3)
            return true;
        else
            throw new InvalidPasswordException("Password must contain at least three digits");
    }

    private boolean isDigit(char symbol){
        return Character.isDigit(symbol);
    }

    private boolean isCorrectLength() throws InvalidPasswordException{
        if(password.length()>=5 && password.length()<=12){
            return true;
        }
        else
            throw new InvalidPasswordException("Password length must be between 5 and 12 symbols");
    }

}
