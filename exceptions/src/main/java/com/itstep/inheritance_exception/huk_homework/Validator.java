package com.itstep.inheritance_exception.huk_homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
написать пароль валидатор
(               # Начало группы
(?=.*[A-Z])     # пароль должен содержать минимум 1 заглавную букву,
(?=.*[@$!%*?&]) # 1 спец символ,
(?=.*\d{3})     # минимум 3 цифры,
{5,12}          # и быть длинной от 5 до 12 символов
)               # Конец группы
Во всех остальных случаях валидатор дожен бросать свой кастомный эксепшн
 */



public class Validator {

    private String password;


    public Validator(String password) {
        this.password = password;
    }


    boolean isPasswordValidation() throws PasswordNotValidException {
        return hasMinOneCapitalLetters(password) && isLongFromFiveToTwelve(password) && hasMinThreeDigits() && hasOneSpecialCharacter();
    }


    private boolean hasMinThreeDigits() throws PasswordNotValidException{ //иметь миниум 3ри цыфры

        Pattern pattern = Pattern.compile("(?=.*\\d{3})");
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            return true;
        } else throw new PasswordNotValidException("Пароль повинен містити не менше трьох цифр");
    }


    private boolean hasOneSpecialCharacter() throws  PasswordNotValidException{ //иметь 1н спец символ
        Pattern pattern = Pattern.compile("(?=.*[@$!%*?&])");
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            return true;
        } else throw new PasswordNotValidException("Пароль повинен містити принаймні один спеціальний символ");
    }


    private boolean hasMinOneCapitalLetters(String password) throws PasswordNotValidException { //иметь минимум одну заглавную букву
        Pattern pattern = Pattern.compile("(?=.*[A-Z])");
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            return true;
        } else throw new PasswordNotValidException("Пароль повинен містити принаймні одну велику літеру");

  /* char[] array = password.toCharArray();
        for (char x : array) {
            if (Character.isUpperCase(x)) { //Character - класс
                return true;
            } else throw new PasswordNotValidException("Пароль повинен містити принаймні одну велику літеру");
        }
        return false;*/

    }


    private boolean isLongFromFiveToTwelve(String password) throws PasswordNotValidException { //быть длиной от 5ти до 12ти
        Pattern pattern = Pattern.compile(".{5,12}");
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            return true;
        } else throw new PasswordNotValidException("Пароль повинен містити від 5 до 12 символів");

        /*    if (this.password.length() >= 5 && this.password.length() <= 12) {
            return true;
        }
        else throw new PasswordNotValidException("Пароль повинен містити від 5 до 12 символів");
    }*/

    }
}
