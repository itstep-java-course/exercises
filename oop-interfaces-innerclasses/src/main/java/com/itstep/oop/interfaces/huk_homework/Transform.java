package com.itstep.oop.interfaces.huk_homework;

abstract class Transform {

    abstract protected String doTransform (String str);

    public String[] doTransformArray(String[] strs) {
        String[] outStrings = new String[strs.length];
        for (int i = 0; i <strs.length ; i++) {
            outStrings[i] = this.doTransform(strs[i]);
        }
        return outStrings;
    }
}
