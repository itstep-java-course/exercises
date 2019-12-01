package com.itstep.oop.interfaces.dudkin_homework.program_internals;

public class ThirdLogic extends SecondLogic {
    public ThirdLogic(String firstString) {
        super(firstString);
        inputStr = result;
        doMainLogic();
    }

    @Override
    protected void doMainLogic() {
        int counter = 0;
        for (int j = 0; j < inputStr.length; j++) {
            if (inputStr[j].length() > 6)
                counter++;
        }
        result = new String[counter];
        for (int k = 0, g = 0; k < inputStr.length; k++) {
            if (inputStr[k].length() > 6) {
                result[g] = inputStr[k];
                g++;
            }
        }
    }
}
