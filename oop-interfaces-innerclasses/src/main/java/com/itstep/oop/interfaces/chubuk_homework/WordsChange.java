package com.itstep.oop.interfaces.chubuk_homework;

class WordsChange implements WordDesigner{

    @Override
    public String[] outputLatestVersion(String[] word){
        String[] result = new String[word.length];
        for (int i = 0; i < word.length; i++)
                result[i] = word[i].charAt(0) + "" + (word[i].length()-2) + "" + word[i].charAt(word[i].length() - 1);
        return result;
    }
}
