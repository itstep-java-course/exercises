package com.itstep.oop.interfaces.strahov_hometask;

public class LogicFirst extends Convert  {
    public LogicFirst(String firstString){
        super(firstString);
        inputString=result;
        doMainLogic();

    }
    protected void doMainLogic(){
        for (int i = 0; i <inputString.length ; i++) {
            int length= inputString[i].length()-2;
            result[i]=inputString[i].charAt(0)+Integer.toString(length)+inputString[i].charAt(length+1);
            
        }
    }

}
