package com.itstep.oop.interfaces.perepeliatnyk_homework.new_homework;

public class ReverseTramsformer implements WordTransformer {

    @Override
    public String transform(String word) {
        return new StringBuilder().append(word).reverse() + " ";
    }
}
