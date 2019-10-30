package com.itstep.string.array.huk_homework;

/*3. Создать двумерный массив и вывести все его элементы в консоль.*/

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        //длинная запись
        int[][] twoDimArray1 = new int[3][3];//3 строчки и 3 колонки
        twoDimArray1[0] = new int[]{1, 2, 3};
        twoDimArray1[1] = new int[]{4, 5, 6};
        twoDimArray1[2] = new int[]{7, 8, 9};

        System.out.println("Our TwoDimArray1: ");
        for (int i = 0; i < twoDimArray1.length; i++) {
            //for (int j = 0; j < twoDimArray1.length; j++) { //почему работает twoDimArray1.length и twoDimArray1[i].length
            // а понял работает когда у наших массивы одинаковые строки и колонки
            for (int j = 0; j < twoDimArray1[i].length; j++) {
                System.out.print(twoDimArray1[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("============================================================\n");
        int[][] twoDimArray2 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};//короткая запись
        System.out.println("Our TwoDimArray2 = " + Arrays.deepToString(twoDimArray2) + "\n");//самый короткий способ вывода
        // списка элементов двумерного массива на екран - метод deepToString класса Arrays.


        System.out.println("============================================================\n");
        int[][] twoDimArray3 = {{111, 112, 113}, {114, 115, 116}, {117, 118, 119}};//короткая запись
        System.out.println("Our TwoDimArray3: ");
        for (int[] i : twoDimArray3) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}








