package com.itstep.string.array.shilov.homework;

class Array {

    public static void main(String[] args) {

        String[] str = new String[]{ "java", "courses", "itstep", "phiton","arriva", "array", "String"};
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() <= 5) {
                System.out.println("Strings whose length is less than or equal to 5: " + str[i]);
            } else if (str[i].startsWith("p")) {
                System.out.println("Strings starting with a letter \"p\": " + str[i]);
            } else if (str[i].endsWith("a")) {
                System.out.println("Strings ending with a letter \"a\": "+str[i]);
            }
        }
        System.out.println("Array length: " + str.length);
    }
}

