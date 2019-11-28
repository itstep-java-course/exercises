package com.itstep.oop.interfaces.chubuk_homework;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "description,main,maintenance-polimorfism encapsulation, bodies";
        ResultPrint resultPrint = new ResultPrint();
        System.out.println(Arrays.deepToString(resultPrint.printAll(str)));
    }
}
