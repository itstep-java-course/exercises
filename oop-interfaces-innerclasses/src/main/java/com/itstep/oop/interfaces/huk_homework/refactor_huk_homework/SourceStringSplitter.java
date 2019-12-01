package com.itstep.oop.interfaces.huk_homework.refactor_huk_homework;

public class SourceStringSplitter {
    private final String sourceStr;

    public SourceStringSplitter(String sourceStr) {
        this.sourceStr = sourceStr;
    }

    public String[] makeSplit(){


        String[] str1 = sourceStr.split("[/ ,-]+");
        //ResultPrinter.print(str1);
        return str1;
    }
}
