package com.itstep.control.structures.likhomanov_classwork;

import java.util.Scanner;

public class IfElseTask {

    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);

        System.out.println("Задай число: ");

        x = in.nextInt();

        if (x == 6) {
            System.out.println(x);
        } else if (x == 3) {
            System.out.println(x);
            System.out.println("5");
        } else if (x <= 5) {
            System.out.println("5");
        } else {
            System.out.println("0");
        }
    }

}
