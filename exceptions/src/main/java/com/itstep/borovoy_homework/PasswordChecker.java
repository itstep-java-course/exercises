package com.itstep.borovoy_homework;

public class PasswordChecker {
    public static void main(String[] args)   {
        String password = "My_pass123";
        System.out.println(password);
        PasswordValidator validator = new PasswordValidator(password);
        try {
            if(validator.isPasswordValid())
                System.out.println("Password is correct");

        } catch (InvalidPasswordException e) {
            e.printStackTrace();
        }
    }

}
