package com.itstep.oop.interfaces.perepeliatnyk_homework;

public class LongReplaceableWord extends ReplaceableWord {

    public LongReplaceableWord(String word) {
        super(word);
    }

    @Override
    public void modify() {
        if (getWord().length() > 6) {
            super.modify();
        }
    }
}
