package com.itstep.string.array.perepeliatnyk_homework;

//создать строку “hello_java_world”
//        - Разбить строку на отдельные слова (split)
//        - У каждого слова вывести 2 и 3 символ
//        - У каждого слова заменить букву ‘o’ на символ ‘$’

public class StringTask2 {
    public static void main(String[] args) {
        String x = "hello_java_world";
        String[] x1 = x.split("_");
        for (String y  : x1){
            System.out.println(y);
        }
        for (int i = 0; i <x1.length ; i++) {
            System.out.println(x1[i].substring(1, 3));
        }
        for (int i = 0; i <x1.length ; i++) {
            String c = x1[i].replace("o","$" );
            System.out.println(c);

        }


        }

    }



