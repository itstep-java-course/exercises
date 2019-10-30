package com.itstep.string.array.chubuk_array_string;

public class DoubleArrayTask3
{
    public static void main(String[] args)
    {
        int[][] arr = new int[3][3];
        arr[0] = new int[]{1, 2, 3};
        arr[1] = new int[]{2, 1, 2};
        arr[2] = new int[]{3, 2, 1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
