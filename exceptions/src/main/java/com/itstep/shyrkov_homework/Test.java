package com.itstep.shyrkov_homework;

public class Test {
    public static void main(String[] args) {
        String password = "Pa$sw000rd";
        PasswordValidator validator = new PasswordValidator(password);
        try {
            if(validator.isPasswordValid())
                System.out.println("Password is correct");

        } catch (InvalidPasswordException e) {
            e.printStackTrace();
        }
    }


}
