package com.itstep.oop.interfaces.huk_homework.refactor_huk_homework;

public class ResultPrinter {
    public void print(String[] transformedStrings) {
        for (String transformedString : transformedStrings) {
            System.out.println(transformedString);
        }
    }



   /* static public void Print(String[] strs) {
        System.out.println();
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i] + " ");
        }
    }*/
}
