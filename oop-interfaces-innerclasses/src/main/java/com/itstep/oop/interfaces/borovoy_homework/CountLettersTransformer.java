package com.itstep.oop.interfaces.borovoy_homework;

public class CountLettersTransformer implements WordTransformer {

    @Override
    public String transform(String word) {
        return " " + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1);
    }

}