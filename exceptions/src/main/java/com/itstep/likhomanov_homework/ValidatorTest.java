package com.itstep.likhomanov_homework;

import java.util.Scanner;

public class ValidatorTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter your password");
            Validator validator = new Validator(in.nextLine());

            try {
                if (validator.isPasswordValid()) {
                    System.out.println("Congrats! Your password matches requirement!");
                }
            } catch (PasswordNotValidException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
