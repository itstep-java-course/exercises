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
        System.out.println("The general solution of the quadratic equation:");
        Scanner is = new Scanner(System.in);
        System.out.println("Enter cons a, b and c");
        int a = is.nextInt();
        int b = is.nextInt();
        int c = is.nextInt();
        int D = b * b - (4 * a * c);
        if (D < 0)
            System.out.println("No valid solution");
        else if (D == 0) {
            double x = (-b / (2 * a));
            System.out.println("Root of the quadratic equation"+x);
        } else {
            double x1 = ((-b + sqrt(D)) / (2 * a));
            double x2 = ((-b - sqrt(D)) / (2 * a));
            System.out.println("First root of the quadratic equation=" + x1 + "\nSecond root of the quadratic equation=" + x2);
        }
    }
}
