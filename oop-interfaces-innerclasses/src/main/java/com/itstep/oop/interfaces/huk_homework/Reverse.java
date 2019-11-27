
package com.itstep.oop.interfaces.huk_homework;

class Reverse extends Transform{



    @Override
    protected String doTransform(String str) {
        String outString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            outString = outString + str.charAt(i);                //System.out.print(ch[i]);
        }
        return outString;
    }
}