package com.itstep.string.array.chubuk_array_string;

public class CrystalTask3 {
    public static void main(String[] args)
    {
        int[][] arr = new int[3][3];
        arr[0] = new int[]{1, 2, 3};
        arr[1] = new int[]{2, 1, 2};
        arr[2] = new int[]{3, 2, 1};

        for (int[] i:arr) {
            for (int j:i) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
