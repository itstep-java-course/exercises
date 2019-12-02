package com.itstep.oop.interfaces.chubuk_homework;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "description,main,maintenance-polimorfism encapsulation, bodies";
        ResultArray resultPrint = new ResultArray();
        String[][] result = resultPrint.printAll(str);

        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
