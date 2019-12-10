package com.itstep.oop.interfaces.perepeliatnyk_homework;

public class ReversibleWord extends Word {

    public ReversibleWord(String word) {
        super(word);
    }

    @Override
    public void modify() {
        System.out.print(new StringBuilder().append(getWord()).reverse() + " ");

    }
}
