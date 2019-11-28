package com.itstep.oop.principles.polimorf.shyrkov_homework;

public class TransformerToFirstLogic implements Transformable{

    @Override
    public String transformString(String str) {

        return ""+str.charAt(0)+""+(str.length()-2)+""+str.charAt(str.length()-1);
    }
}
