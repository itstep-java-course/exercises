package com.itstep.oop.principles.safankov_validator_homework;

public class Test {
    public static void main(String[] args) {
        String password = "@a$sWMr10d0";
        Validator validator = new Validator(password);
        try {
            if(validator.isPasswordValid())
                System.out.println(" Пароль подходит! ");

        } catch (InvalidPasswordException exp) {
            exp.printStackTrace();
        }
    }
    }


