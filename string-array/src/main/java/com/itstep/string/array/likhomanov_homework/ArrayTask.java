package com.itstep.string.array.likhomanov_homework;

import java.util.Random;

public class ArrayTask {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] ints = new int[5][10];

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = random.nextInt(100);
            }
        }

        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }
}
