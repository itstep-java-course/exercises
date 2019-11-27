package com.itstep.oop.interfaces.likhomanov_homework;

class Replacer extends Modificator {

    Replacer(Modifiable modifiable) {
        super(modifiable);
    }

    @Override
    public String modify() {
        return replace(getModifiable().modify());
    }

    private String replace(String word) {
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
