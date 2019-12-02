package com.itstep.oop.interfaces.huk_homework;

public class SplitLine {


    public String[] split(String str) {

        String[] str1 = str.split("[/ ,-]+");
        ShowStrings.Print(str1);
        return str1;
    }
}
