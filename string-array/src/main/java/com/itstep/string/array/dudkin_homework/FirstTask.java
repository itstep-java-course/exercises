package com.itstep.string.array.dudkin_homework;

public class FirstTask {
    public static void main(String[] args) {
        String[] array = {"Can", "they", "stay", "for", "tea", "please"};
        for (int i = 0; i < 6; i++)
            if (array[i].length() <= 5)
                System.out.println(array[i]);
        System.out.println("");
        for (int i = 0; i < 6; i++)
            if (array[i].startsWith("p"))
                System.out.println(array[i]);
        System.out.println("");
        for (int i = 0; i < 6; i++)
            if (array[i].endsWith("a"))
                System.out.println(array[i]);
            char[][]str=new char[6][];
        System.out.println("");
        int counter=0;
        for (int i = 0; i <6 ; i++) {
            str[i] = new char[array[i].length()];
            str[i]=array[i].toCharArray();
            counter+=array[i].length();
            System.out.println(str[i]);
        }
        System.out.println("");
        System.out.println(counter);
    }
}
