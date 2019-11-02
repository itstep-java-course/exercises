package com.itstep.string.array.dudkin_homework;

public class FirstTask {
    public static void main(String[] args) {
        String[] array = {"Can", "they", "stay", "for", "tea", "please"};
        for (int i = 0; i < array.length; i++)
            if (array[i].length() <= 5)
                System.out.println(array[i]);
        System.out.println("");
        for (int i = 0; i < array.length; i++)
            if (array[i].startsWith("p"))
                System.out.println(array[i]);
        System.out.println("");
        for (int i = 0; i < array.length; i++)
            if (array[i].endsWith("a"))
                System.out.println(array[i]);
        System.out.println("");
        System.out.println(array.length);
    }
}
