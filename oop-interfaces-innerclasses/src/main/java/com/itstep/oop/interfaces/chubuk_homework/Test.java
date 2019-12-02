package com.itstep.oop.interfaces.chubuk_homework;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "description,main,maintenance-polimorfism encapsulation, bodies";
        ResultArray resultPrint = new ResultArray();
        String[][] result = resultPrint.returnAll(str);
        PrintArray printArray = new PrintArray();
        printArray.printArray(result);
    }
}
