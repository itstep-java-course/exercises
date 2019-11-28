package com.itstep.oop.principles.polimorf.shyrkov_homework;

public class TransformerToThirdLogic implements Transformable {
    @Override
    public String transformString(String str) {
        if(str.length()>6)
            return ""+str.charAt(0)+""+(str.length()-2)+""+str.charAt(str.length()-1);
        else
            return "";
    }
}
