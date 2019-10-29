package com.itstep.string.array.huk_homework;

/*
1. Создать массив из произвольных строк длиной не меньше 3-x символов.
- Вывести строки у которых длина меньше или равна 5
- Вывести строки которые начинаются на букву ‘p’
- Вывести строки которые заканчиваются на букву  ‘a’
- Вывести длину массива
 */

public class ArrayString {
    public static void main(String[] args) {
        //короткая запись
        String[] str = new String[]{"Aleksandr", "pading", "Bord", "Javvva", "mammmma"};
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() <= 5) {
                System.out.println("Strings whose length is less than or equal to 5: " + str[i]);
            } else if (str[i].startsWith("p")) { //с учетом регистра
                System.out.println("Strings starting with a letter \"p\": " + str[i]);
            } else if (str[i].endsWith("a")) {  //с учетом регистра
                System.out.println("Strings ending with a letter \"a\": "+str[i]);
            }
        }
        System.out.println("Array length: " + str.length);
    }
}
