package com.itstep.chubuk_homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Character.isDigit;

public class Validator {
    private final String password;

    Validator(String password) {
        this.password = password;
    }

    boolean isPasswordTrue() throws СheckPasswordExeption {
        return  CheckCapsLetter() && CheckLength() && hasSpecialCharacters() && hasEnoughNumbers();
    }

    private boolean CheckLength() throws СheckPasswordExeption {
        if (password.length() >= 5 && password.length() <=12) return true;
        else throw new СheckPasswordExeption("incorrect length");
    }

    private boolean CheckCapsLetter() throws СheckPasswordExeption{
        char[] passwordHaveChars = password.toCharArray();
        for (char passwordChar : passwordHaveChars) {
            if (Character.isUpperCase(passwordChar))
                return true;
        }
        throw new СheckPasswordExeption("Password have not caps letter");
    }

    private boolean hasEnoughNumbers() throws СheckPasswordExeption{
        char[] passwordChars = password.toCharArray();
        int numberCounter = 0;
        for (char passwordChar : passwordChars) {
            if(Character.isDigit(passwordChar))
                numberCounter++;
        }
        if(numberCounter>=3)
            return true;
        else
            throw new СheckPasswordExeption("Password have not enough digits");
    }

    private boolean hasSpecialCharacters () throws СheckPasswordExeption {
        Pattern pattern = Pattern.compile("[^a-z0-9]");
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) return true;
        else throw new СheckPasswordExeption("Password must contain special character");
    }
}
