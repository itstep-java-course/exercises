package com.itstep.staticmethod;

public class RecursionExample {
    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            int i = n * factorial(n - 1);
            return i;
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
