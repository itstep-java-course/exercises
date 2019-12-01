package com.itstep.oop.interfaces.strahov_hometask;

abstract class Convert {
    String[] result;
    String[] inputString;

    Convert(String firstString) {
        String[] unConvertWord = firstString.split(",|-| ");
        int g = 0;
        for (int i = 0; i < unConvertWord.length; i++) {
            if (unConvertWord[i].isEmpty()) {
                ++g;
            }
        }

        result = new String[unConvertWord.length - g];
        for (int i = 0, count = 0; i < unConvertWord.length; i++) {
            if (!unConvertWord[i].isEmpty()) {
                result[count] = unConvertWord[i];
                count++;

            }
        }
    }

public void show(){
    for (int i = 0; i <result.length ; i++) {
        System.out.println(result[i]);

        
    }
}
protected abstract void doMainLogic();
}
