package com.itstep.string.array.likhomanov_homework;

public class Factorial {

    public static void main(String[] args) {

        int value = 10;

        System.out.print("!" + value + " = ");

        for (int i = value - 1; i > 0; i--) {
            value = value * i;
        }

        System.out.println(value);
    }
}
