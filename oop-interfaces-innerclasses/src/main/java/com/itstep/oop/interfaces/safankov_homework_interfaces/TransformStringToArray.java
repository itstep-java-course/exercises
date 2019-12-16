package com.itstep.oop.interfaces.safankov_homework_interfaces;

public class TransformStringToArray {
    protected String[] words;

    public String[] performString(String string){
        return words = string.split("[/ ,-]+");
    }
}
