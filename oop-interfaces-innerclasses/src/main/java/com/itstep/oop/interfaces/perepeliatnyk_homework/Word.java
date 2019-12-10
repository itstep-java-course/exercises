package com.itstep.oop.interfaces.perepeliatnyk_homework;

public abstract class Word implements Modifiable {

    public String getWord() {
        return word;
    }

    private String word;

    public Word(String word) {
        this.word = word;
    }

}
