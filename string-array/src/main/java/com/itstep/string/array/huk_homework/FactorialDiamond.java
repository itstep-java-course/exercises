package com.itstep.string.array.huk_homework;

/*1. Написать программу которая считает факториал числа 10 используя цикл for.*/

import java.util.Scanner;

public class FactorialDiamond {
    public static void main(String[] args) {

        int factorialDiamond = 1;
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer num: ");
        num = sc.nextInt();
        if (num < 0) {
            System.out.println("You entered a negative number !!!");
        } else if (num == 0 || num == 1) {
            System.out.println("Factorial of the number " + num + " = " + factorialDiamond);
        } else {
            for (int i = 2; i <= num; i++) {
                factorialDiamond *= i;
            }
            System.out.println("Factorial of the number " + num + " = " + factorialDiamond);
        }

    /*
        int factorialDiamond = 1;
        int num = 3;
        for (int i = num; i != 0; i--) {
            factorialDiamond *= i;
        }
        System.out.println("Factorial of the number " + num + " = " + factorialDiamond);
    */
    }
}













