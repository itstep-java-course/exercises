package com.itstep.oop.interfaces.safankov_homework_interfaces;

public class Tester {
    public static void main(String[] args) {
        String str = "description,main,maintenance-polimorfism encapsulation, bodies";
        ResultArray resultArray = new ResultArray();
        String[][] result = resultArray.returnArray(str);
        PrintArray printArray = new PrintArray();
        printArray.printArray(result);
    }
}
