package com.itstep.string.array.safankov.homework;
import java.util.Arrays;
public class TwoDimArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Вывод двумерного массива : "+ Arrays.deepToString(arr));
        int[][] arr2 = {{9,8,7},
                        {6,5,4},
                        {3,2,1}};
        System.out.println("Вывод двумерного массива : ");
        for (int i = 0; i <arr2.length ; i++) {
            for(int j = 0;j<arr2[i].length;j++){
                System.out.println(arr2[i][j]+"");
                }
            System.out.println();
        }
    }
}
