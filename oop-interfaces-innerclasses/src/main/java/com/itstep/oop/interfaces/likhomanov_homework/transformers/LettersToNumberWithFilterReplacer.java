package com.itstep.oop.interfaces.likhomanov_homework.transformers;

public class LettersToNumberWithFilterReplacer extends LettersToNumberReplacer {

    @Override
    public String transform(String word) {

        if (word.length() > 6) return super.transform(word);
        else return "";
    }
}
