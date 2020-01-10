package com.itstep.oop.interfaces.strahov_hometask;

public class ReverseString extends Convert{
    public ReverseString(String firstString){
        super(firstString);
        inputString=result;
        for (int i = 0; i <inputString.length ; i++) {
            doMainLogic();
        }
    }
    int l=0;

    @Override
    protected void doMainLogic() {
        char array1[]=new char [inputString[l].length()];
        for (int h =( inputString[l].length()-1),j=0; h >=0 ; h--,j++) {
            array1[j]=inputString[l].charAt(h);
            result[l]=String.valueOf(array1);
        }

    }
}
