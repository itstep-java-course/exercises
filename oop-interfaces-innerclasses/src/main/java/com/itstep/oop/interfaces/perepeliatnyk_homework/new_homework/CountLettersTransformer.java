package com.itstep.oop.interfaces.perepeliatnyk_homework.new_homework;

public class CountLettersTransformer implements WordTransformer {

    @Override
    public String transform(String word) {
        return " " + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1);
    }

}
