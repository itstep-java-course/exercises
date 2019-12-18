package com.itstep.oop.principles.polimorf.shyrkov_homework;

public class TransformerToSecondLogic implements Transformable {
    @Override
    public String transformString(String str) {
        String res = "";
        for (int i = str.length()-1; i >= 0; i--) {
            res+=str.charAt(i);
        }
        return res;
    }
}
