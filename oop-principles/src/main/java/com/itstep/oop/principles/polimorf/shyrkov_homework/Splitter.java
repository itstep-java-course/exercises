package com.itstep.oop.principles.polimorf.shyrkov_homework;

public class Splitter {

    public String[] split(String str){
        String[] strArray = str.split("[/ ,-]+");
        StringArrayPrinter.printArray(strArray);
        return strArray;
    }
}
