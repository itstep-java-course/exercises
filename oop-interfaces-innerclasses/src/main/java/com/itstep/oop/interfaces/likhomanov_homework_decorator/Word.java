package com.itstep.oop.interfaces.likhomanov_homework_decorator;

class Word implements Modifiable {

    private final String word;

    Word(String word) {
        this.word = word;
    }

    @Override
    public String modify() {
        return word;
    }
}
