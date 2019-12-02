package com.itstep.oop.interfaces.chubuk_homework;

public class TransformToArray
{
    protected String[] words;

    public String[] performString(String sting){
        return words = sting.split("[/ ,-]+");
    }
}
