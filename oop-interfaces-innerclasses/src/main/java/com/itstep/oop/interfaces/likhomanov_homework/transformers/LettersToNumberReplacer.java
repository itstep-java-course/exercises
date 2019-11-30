package com.itstep.oop.interfaces.likhomanov_homework.transformers;

public class LettersToNumberReplacer implements WordTransformer {

    @Override
    public String transform(String word) {
        if (!word.isEmpty()) {
            return word.charAt(0) +
                    String.valueOf(word.length() - 2) +
                    word.charAt(word.length() - 1) +
                    " ";
        } else {
            return word;
        }
    }
}
