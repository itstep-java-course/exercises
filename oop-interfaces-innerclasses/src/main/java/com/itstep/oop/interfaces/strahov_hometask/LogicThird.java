package com.itstep.oop.interfaces.strahov_hometask;

public class LogicThird extends LogicSecond {
    public LogicThird(String firstString){
        super(firstString);
        inputString = result;
        doMainLogic();
    }

    @Override
    protected void doMainLogic() {
        int counter = 0;
        for (int j = 0; j < inputString.length; j++) {
            if (inputString[j].length() > 6)
                counter++;
        }
        result = new String[counter];
        for (int k = 0, g = 0; k < inputString.length; k++) {
            if (inputString[k].length() > 6) {
                result[g] = inputString[k];
                g++;
            }
        }
    }
}

