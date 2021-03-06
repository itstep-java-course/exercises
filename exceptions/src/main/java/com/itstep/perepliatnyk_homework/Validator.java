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
        return containAnUppercaseLetter() && containSpecialCharacter() && containThreeDigits() && beLongFromAndTo();
    }

    private boolean containAnUppercaseLetter() throws IsNotSuitablePassword {
//        Pattern pattern = Pattern.compile("(?=.*[A-Z])");
//        Matcher matcher = pattern.matcher(password);

        if (contains("(?=.*[A-Z])")) {
            return true;
        } else throw new IsNotSuitablePassword("Неудача братан, введи большую букву");
    }

    private boolean containSpecialCharacter() throws IsNotSuitablePassword {
//        Pattern pattern = Pattern.compile("(?=.*[@$!%*?&])");
//        Matcher matcher = pattern.matcher(password);

        if (contains("(?=.*[@$!%*?&])")) {
            return true;
        } else throw new IsNotSuitablePassword("Не тупи, введи один спецсимвол");

    }

    private boolean containThreeDigits() throws IsNotSuitablePassword {
//        Pattern pattern = Pattern.compile("(?=.*\\d{3})");
//        Matcher matcher = pattern.matcher(password);

        if (contains("(?=.*\\d{3})")) {
            return true;
        } else throw new IsNotSuitablePassword("Опомнись дружочек, 3 цифры обязательны!");

    }

    private boolean beLongFromAndTo() throws IsNotSuitablePassword {
//        Pattern pattern = Pattern.compile(".{5,12}");
//        Matcher matcher = pattern.matcher(password);

        if (contains(".{5,12}" )) {
            return true;
        } else throw new IsNotSuitablePassword("Ты чего творишь!? пароль не меньше 5 и не больше 12 символов");


    }

    private  boolean contains(String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }


}
