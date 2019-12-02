package com.itstep.oop.interfaces.chubuk_homework;

public class PrintArray {
    public void printArray(String[][] result){
        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
