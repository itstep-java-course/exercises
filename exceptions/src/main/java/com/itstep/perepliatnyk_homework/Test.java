package com.itstep.perepliatnyk_homework;

public class Test {

    public static void main(String[] args) {

        Validator validator = new Validator("Gerb123&");

        try {
            if (validator.isPasswordValid()) {

                System.out.println("Красавчик! Все отлично!");
            }
        } catch (IsNotSuitablePassword e) {
            System.out.println(e.getMessage());
        }

    }
}


