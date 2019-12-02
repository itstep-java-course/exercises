package com.itstep.oop.interfaces.huk_homework;

public class HideSix extends Transform {


    @Override
    protected String doTransform(String str) {
        if (str.length() > 6) {
            return "" + str.charAt(0) + (str.length() - 2) + str.charAt(str.length() - 1);
        } else
            return "";  //return null;

    }
}
