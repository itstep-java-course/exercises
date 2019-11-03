package com.itstep.string.array.shyrkov_homework;

public class Task1 {
    public static void main(String[] args) {
        String[] strs = new String[]{"Java", "public", "static", "void", "main", "String", "args"};

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() <= 5) {
                System.out.println(strs[i]);
            } else if (strs[i].charAt(0) == 'p') {
                System.out.println(strs[i]);
            } else if (strs[i].charAt(strs[i].length() - 1) == 'a') {
                System.out.println(strs[i]);
            }
        }
        System.out.println("Length = " + strs.length);

    }
}
