package com.itstep.chubuk_homework;
import java.util.Scanner;

public class Test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a password: ");

            Validator validator = new Validator(in.nextLine());
            try {
                if(validator.isPasswordTrue())
                    System.out.println("Password is correct");

            } catch (СheckPasswordExeption e) {
                e.printStackTrace();
            }
        }
}
