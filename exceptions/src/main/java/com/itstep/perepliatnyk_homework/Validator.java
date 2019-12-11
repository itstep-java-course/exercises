package com.itstep.perepliatnyk_homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//написать пароль валидатор
//        - пароль должен содержать минимум 1 заглавную букву,
//        - спец символ,
//        - минимум 3 цифры,
//        - быть длинной от 5 до 12 символов
//        Во всех остальных случаях валидатор дожен бросать свой кастомный эксепшн

public class Validator {

    private String password;

    public Validator(String password) {
        this.password = password;
    }

    boolean isPasswordValid() throws IsNotSuitablePassword {
        return containAnUppercaseLetter(password) && containSpecialCharacter(password) && containThreeDigits(password) && beLongFromAndTo(password);
    }

    private boolean containAnUppercaseLetter(String password) throws IsNotSuitablePassword {
        Pattern pattern = Pattern.compile("(?=.*[A-Z])");
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            return true;
        } else throw new IsNotSuitablePassword("Неудача братан, введи большую букву");
    }

    private boolean containSpecialCharacter(String password) throws IsNotSuitablePassword {
        Pattern pattern = Pattern.compile("(?=.*[@$!%*?&])");
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            return true;
        } else throw new IsNotSuitablePassword("Не тупи, введи один спецсимвол");

    }

    private boolean containThreeDigits(String password) throws IsNotSuitablePassword {
        Pattern pattern = Pattern.compile("(?=.*\\d{3})");
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            return true;
        } else throw new IsNotSuitablePassword("Опомнись дружочек, 3 цифры обязательны!");

    }

    private boolean beLongFromAndTo(String password) throws IsNotSuitablePassword {
        Pattern pattern = Pattern.compile(".{5,12}");
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            return true;
        } else throw new IsNotSuitablePassword("Ты чего творишь!? пароль не меньше 5 и не больше 12 символов");


    }

}
