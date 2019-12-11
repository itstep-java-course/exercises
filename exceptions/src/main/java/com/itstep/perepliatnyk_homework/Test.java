package com.itstep.perepliatnyk_homework;

public class Test {

    public static void main(String[] args) throws IsNotSuitablePassword {

        Validator validator = new Validator("Gerb123$");

        System.out.println(validator.isPasswordValid());

        try {
            if (validator.isPasswordValid()) {

                System.out.println("Красавчик! Все отлично!");
            }
        } catch (IsNotSuitablePassword e) {
            System.out.println(e.getMessage());
        }

    }
}


