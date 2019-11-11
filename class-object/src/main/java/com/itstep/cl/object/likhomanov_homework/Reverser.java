package com.itstep.cl.object.likhomanov_homework;

public class Reverser {

    private String inputString;

    public Reverser () {
        inputString = "Empty string";
    }

    public Reverser (String inputString) {
        this.inputString = inputString;
    }

    public String doReverse() {
        String outputString = "";
        for (int index = inputString.length() - 1; index > -1; --index) {
            outputString = outputString + inputString.charAt(index);
        }
        return outputString;
    }
}
