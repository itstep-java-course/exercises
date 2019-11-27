package com.itstep.oop.interfaces.perepeliatnyk_homework;

public class ReplaceableWord extends Word {

    public ReplaceableWord(String word) {
        super(word);
    }

    @Override
    public void modify() {
        System.out.print(getWord().charAt(0) + String.valueOf(getWord().length() - 2) + getWord().charAt(getWord().length() - 1) + " ");

    }

}
