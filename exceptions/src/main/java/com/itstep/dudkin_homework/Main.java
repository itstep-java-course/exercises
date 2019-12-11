package com.itstep.dudkin_homework;

public class Main {
    public static void main(String[] args) throws ValidationException {
        PasswordValidator validator = new PasswordValidator("F333/");
        validator.check();
        System.out.println("===============================");
        PasswordValidator validator1 = new PasswordValidator("F333");
        validator1.check();
    }
}
