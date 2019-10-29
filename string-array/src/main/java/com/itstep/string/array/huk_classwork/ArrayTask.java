package com.itstep.string.array.huk_classwork;

public class ArrayTask {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        arr[3] =12;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int i1 = arr[3];
        System.out.println(i1);
    }
}


