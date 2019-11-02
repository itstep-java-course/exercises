package com.itstep.string.array.likhomanov_classwork;

public class ArrayExample {

    public static void main(String[] args) {

        int[] ints = new int[5];
        int[] ints2 = {1, 2, 3, 4};

        ints[0] = 12;

        String[] strings = new String[]{"", "", ""}; //добавляется в String Pool
        String[] strings1 = new String[3];
        strings1[0] = "v1";
        strings1[1] = "v2";
        strings1[2] = "v3";

        int[][] arr_complex = new int[3][2];
        arr_complex[0] = new int[]{3, 4};
        arr_complex[1] = new int[]{4, 5};
        arr_complex[2] = new int[]{6, 7};

        for (int[] arr : arr_complex) {
            for (int i : arr) {
                System.out.println(i);
            }
        }
    }
}
