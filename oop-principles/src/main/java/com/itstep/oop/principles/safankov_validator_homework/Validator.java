package com.itstep.oop.principles.safankov_validator_homework;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private final String password;

    public Validator(String password) {
        this.password = password;
    }
    public boolean isPasswordValid() throws InvalidPasswordException{
        return containsUpLetter()&&hasSpecialSymbol()&&containsThreeDigits()&&hasCorrectLength();
    }
    private boolean containsUpLetter() throws InvalidPasswordException {
        char[] passwordInChars = password.toCharArray();
        for (char passwordChar : passwordInChars) {
            if (Character.isUpperCase(passwordChar))
                return true;
        }
        throw new InvalidPasswordException("Пароль должен иметь хотя-бы 1 заглавную букву! ");
    }

    private boolean hasSpecialSymbol() throws InvalidPasswordException {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(password);

        if (matcher.find())
            return true;
        else
            throw new InvalidPasswordException("Пароль должен иметь хотя-бы 1 спец-символ! ");
    }
    private boolean hasCorrectLength() throws InvalidPasswordException{
        if(password.length()>=5 && password.length()<=12){
            return true;
        }
        else
            throw new InvalidPasswordException("Пароль должен иметь длинну от 5 до 12 символов! ");
    }
    private boolean isDigit(char symbol){
        return Character.isDigit(symbol);
    }
    private boolean containsThreeDigits() throws InvalidPasswordException{
        char[] passwordInChars = password.toCharArray();
        int digitCounter = 0;
        for (char passwordChar : passwordInChars) {
            if(isDigit(passwordChar))
                digitCounter++;
        }
        if(digitCounter>=3)
            return true;
        else
            throw new InvalidPasswordException("Пароль должен иметь хотя-бы 1 цифру! ");
    }
}
