package com.itstep.oop.interfaces.likhomanov_homework_decorator;

public class LongReplacer extends Replacer {

    LongReplacer(Modifiable modifiable) {
        super(modifiable);
    }

    @Override
    public String modify() {
        return replaceIfLong(getModifiable().modify());
    }

    private String replaceIfLong(String word) {
        if (word.length() > 6) return super.modify();
        else return "";
    }
}
