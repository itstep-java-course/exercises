package com.itstep.string.array.perepeliatnyk_homework;

//Создать массив из произвольных строк длиной не меньше 3-x символов.
//        - Вывести строки у которых длина меньше или равна 5
//        - Вывести строки которые начинаются на букву ‘p’
//        - Вывести строки которые заканчиваются на букву  ‘a’
//        - Вывести длину массива

import java.sql.SQLOutput;

public class StringTask1 {
    public static void main(String[] args) {
        String[] x = new String[]{"hello", "java", "rabbit", "pacific", "toyota"};
        for (int i = 0; i <x.length ; i++) {
            if (x[i].length() <=5) {
            System.out.println(x[i]);
            } else if (x[i].startsWith("p")) {
                System.out.println(x[i]);
            } else if (x[i].endsWith("a")) {
                System.out.println(x[i]);
            }

        }
        System.out.println(x.length);

    }
}
