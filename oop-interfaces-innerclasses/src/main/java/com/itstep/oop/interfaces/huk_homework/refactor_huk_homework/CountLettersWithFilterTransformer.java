package com.itstep.oop.interfaces.huk_homework.refactor_huk_homework;

public class CountLettersWithFilterTransformer extends CountLettersTransformer {

    @Override
    public String transform(String word) {
        if (word.length() > 6) {
            return super.transform(word);
        }
        return "";//?
    }
}
