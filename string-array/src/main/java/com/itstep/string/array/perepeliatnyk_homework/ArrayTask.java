package com.itstep.string.array.perepeliatnyk_homework;

//Создать двумерный массив и вывести все его элементы в консоль.

public class ArrayTask {
    public static void main(String[] args) {
        int[][] sx_complex = new int[5][7];
        sx_complex[0] = new int[]{2, 4, 6, 8, 10, 12, 14};
        sx_complex[1] = new int[]{3, 5, 7, 9};
        sx_complex[2] = new int[]{1, 2, 3, 4, 5, 6, 7};
        sx_complex[3] = new int[]{8, 9, 10, 11, 12, 13, 14};
        sx_complex[4] = new int[]{13, 11, 9, 7};

        for (int[] complex: sx_complex ) {
            for (int x : complex) {
                System.out.println(x);
            }

        }

    }
}
