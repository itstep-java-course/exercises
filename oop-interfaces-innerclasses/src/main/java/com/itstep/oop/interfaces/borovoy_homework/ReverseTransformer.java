package com.itstep.oop.interfaces.borovoy_homework;

public class ReverseTransformer implements WordTransformer {
    @Override
    public String transform(String word) {
        char[] arr = word.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i]);
        System.out.print(" ");
        return "";
    }
}
