package com.itstep.oop.interfaces.borovoy_homework;

public class CountLettersWithFilterTransformer extends CountLettersTransformer {
    @Override
    public String transform(String word) {
        if (word.length() > 6) {
            return super.transform(word);
        }
        return "";
    }
}