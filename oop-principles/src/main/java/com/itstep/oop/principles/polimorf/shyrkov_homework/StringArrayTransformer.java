package com.itstep.oop.principles.polimorf.shyrkov_homework;

public class StringArrayTransformer {
    public String[] transform(String[] strs, Transformable transformable){
        String[] resArray = strs.clone();
        for (int i = 0; i < strs.length; i++) {
            resArray[i] = transformable.transformString(strs[i]);
        }
        return resArray;

    }
}
