package com.itstep.string.array.shilov_homework;

public class HomeWorkString {

        public static void main(String[] args) {
            String str1 = "hello_java_world";
            String[] str2 = str1.split("_");
                System.out.println("Our words: ");
            for (int i = 0; i < str2.length; i++) {
                System.out.println(str2[i]);
            }
                System.out.println("Each word displayed 2 and 3 characters: ");
            for (int i = 0; i < str2.length; i++)
                System.out.println(str2[i].substring(1, 3));
                System.out.println("Each word has the letter ‘o’ replaced by the symbol ‘$’: ");
            for (int i = 0; i < str2.length; i++) {
            String str3 = str2[i].replace("o", "$");
                System.out.println(str3);
            }
        }
    }



