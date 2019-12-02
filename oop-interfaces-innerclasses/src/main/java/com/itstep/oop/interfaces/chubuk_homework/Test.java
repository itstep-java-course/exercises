package com.itstep.oop.interfaces.chubuk_homework;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "description,main,maintenance-polimorfism encapsulation, bodies";
        ResultArray resultArray = new ResultArray();
        String[][] result = resultArray.returnFinalArray(str);
        ArrayPrinter printArray = new ArrayPrinter();
        printArray.printArray(result);
    }
}
