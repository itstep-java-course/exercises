package com.itstep.oop.principles.polimorf.shyrkov_homework;

public class StringArrayPrinter {
    public void printArray(String[] strArray){
        for (String s : strArray) {
            if(s!="")
            System.out.println(s+" ");
        }
        System.out.println();
    }
}
