package com.itstep.string.array.shyrkov_homework;

import java.util.Scanner;

public class ExtraTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = in.nextInt();
        System.out.println("Enter number b");
        int b = in.nextInt();
        System.out.println("Enter number c");
        int c = in.nextInt();

        int D = (int) Math.pow(b, 2)-(4*a*c);
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else
            System.out.println("There are no solutions");
    }
}
