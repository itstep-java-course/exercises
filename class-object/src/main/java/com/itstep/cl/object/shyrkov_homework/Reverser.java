package com.itstep.cl.object.shyrkov_homework;

public class Reverser {
    private String inputString;
    public Reverser(String inputString){
        this.inputString = inputString;
    }
    public String doReverse(){
        String res = "";
        char[] charArr = inputString.toCharArray();
        for(int i=inputString.length()-1;i>=0;i--){
            res+=charArr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Reverser reverser = new Reverser("hello");
        System.out.println(reverser.doReverse());
    }
}
