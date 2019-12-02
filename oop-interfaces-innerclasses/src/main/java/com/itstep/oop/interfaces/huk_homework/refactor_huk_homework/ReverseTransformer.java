package com.itstep.oop.interfaces.huk_homework.refactor_huk_homework;

public class ReverseTransformer implements  WordTransformer {

    @Override
    public String transform(String word) {

        String outString = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            outString = outString + word.charAt(i);                //System.out.print(ch[i]);
        }
        return outString;
    }
}

