package com.itstep.string.array.borovoy_homework;

import javax.swing.*;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class StringArrayThirdTask {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}};
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Factorial:");
        int result = 1;
        for (int i = 1; i <= 10; i++) {
            result *= i;
            System.out.print(i + "\t" + result);
            System.out.println();
        }
        System.out.println("Quadratic equation:");
        int a = 5;
        int b = -8;
        int c = 3;
        int d = b*b- 4 * a * c;
        double x1 = (-b + sqrt(d)) / (2 * a);
        double x2 = (-b - sqrt(d)) / (2 * a);
        if (d > 0) {
            System.out.println("Root=" + x1);
            System.out.println("Root=" + x2);
        } else if (d == 0) {
            x1=(-b)/(2*a);
            System.out.println("Root=" + x1);
        } else if (d < 0) {
            System.out.println("There are no roots");
        }
    }
}

