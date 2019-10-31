package com.itstep.string.array.dudkin_homework;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.exp;
import static java.lang.Math.sqrt;

public class ThirdTask {
    public static void main(String[] args) {
        int[][] mas = new int[5][];
        for (int i = 0; i < 5; i++)
            mas[i] = new int[2];
        Random random = new Random();
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 2; j++) {
                mas[i][j] = random.nextInt(100) - 50;
                System.out.println(mas[i][j]);
            }
        System.out.println("Factorial of 10:");
        int fact = 1;
        for (int i = 10; i != 0; i--)
            fact *= i;
        System.out.println(fact);
        System.out.println("General solution of a second order differential equation:");
        Scanner is = new Scanner(System.in);
        System.out.println("Enter cons p and q");
        int p = is.nextInt();
        int q = is.nextInt();
        int D = p * p - 4 * q;
        if (D < 0)
            System.out.println("No valid solution");
        else if (D == 0) {
            double x = (-p / 2);
            System.out.println("(Constant1 * x +Constant2)*exponent raised to the (x*" + x + ")");
        } else {
            double x1 = ((-p + sqrt(D)) / 2);
            double x2 = ((-p - sqrt(D)) / 2);
            System.out.println("Constant1 * exponent raised to the(" + x1 + "*x) power+Constant2 * exponent raised to the(" + x2 + "*x)power");
        }

    }
}
