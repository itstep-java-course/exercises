package com.itstep.string.array;

public class ArrayExamples {
    public static void main(String[] args) {
        //create array, syntax
        //add element to array
        //retrieve element
        //remove element

        //
        int[] arr = new int[5];
        arr[4] = 4;

        System.out.println(arr[4]);

        for (int i : arr) {
            System.out.println(i);
        }

        int[][] arr_complex = new int[3][2];
        arr_complex[0] = new int[]{3, 4};
        arr_complex[1] = new int[]{4, 5};
        arr_complex[2] = new int[]{5, 6};

        for (int[] complex : arr_complex) {
            for (int i : complex) {
                System.out.println(i);
            }
        }
    }
}
