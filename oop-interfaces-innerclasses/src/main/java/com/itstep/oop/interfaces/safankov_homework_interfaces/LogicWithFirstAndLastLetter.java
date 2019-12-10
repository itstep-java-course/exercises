package com.itstep.oop.interfaces.safankov_homework_interfaces;

public class LogicWithFirstAndLastLetter extends WordStyle {
    @Override
    public String[] reverser(String[] word){
        String[] result = new String[word.length];
        for (int i = 0; i < word.length; i++)
            result[i] = word[i].charAt(0) + "" + (word[i].length()-2) + "" + word[i].charAt(word[i].length() - 1);
        return result;
    }
}
