package com.itstep.oop.interfaces.likhomanov_homework.transformers;

public class Reverser implements WordTransformer {

    @Override
    public String transform(String word) {

        return new StringBuilder().append(word).reverse() + " ";
    }
}
