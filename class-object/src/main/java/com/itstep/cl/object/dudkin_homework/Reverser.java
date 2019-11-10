package com.itstep.cl.object.dudkin_homework;

import java.util.Arrays;

public class Reverser {
    private String inputString;
    public Reverser(String inputString){
        this.inputString=inputString;
        
    }
    public String doReverse(){
        char array1[]=new char[inputString.length()];
        for (int i = (inputString.length()-1),j=0; i >=0; i--,j++)
             array1[j]=inputString.charAt(i);
        String outputString=String.valueOf(array1) ;
        return outputString;
    }

    public static void main(String[] args) {
        Reverser str=new Reverser("Hello_everyone");
        System.out.println(str.doReverse());
    }
}
