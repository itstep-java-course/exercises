package com.itstep.oop.interfaces.huk_homework.refactor_huk_homework;

public class CountLettersTransformer implements WordTransformer {

    @Override
    public String transform(String word) {
        return "" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1);
        //return "" + str.charAt(0) + (str.length() -2) + str.charAt(str.length() - 1);
    }
}
