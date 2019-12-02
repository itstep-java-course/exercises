package com.itstep.oop.interfaces.chubuk_homework;

public class ReversWords implements WordDesigner{

    @Override
    public String[] outputLatestVersion(String[] word) {
        String[] reverse = new String[word.length];
        for (int i = 0; i < word.length; i++) {
            reverse[i] = new StringBuffer(word[i]).reverse().toString();
        }
            return reverse;
    }
}
