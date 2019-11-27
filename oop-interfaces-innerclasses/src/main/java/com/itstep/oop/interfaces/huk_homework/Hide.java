package com.itstep.oop.interfaces.huk_homework;

public class Hide extends Transform {


    @Override
    protected String doTransform(String str) {
         return "" + str.charAt(0) + (str.length() -2) + str.charAt(str.length() - 1);
    }
}
