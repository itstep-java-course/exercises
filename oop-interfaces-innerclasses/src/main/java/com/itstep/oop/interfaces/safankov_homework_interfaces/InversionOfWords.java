package com.itstep.oop.interfaces.safankov_homework_interfaces;

public class InversionOfWords extends WordStyle {

    @Override
    public String[] reverser(String[] word) {
        String[] reverse = new String[word.length];
        for (int i = 0; i < word.length; i++) {
            reverse[i] = new StringBuffer(word[i]).reverse().toString();
        }
        return reverse;
    }
}
