package com.itstep.string.array.safankov.homework;

public class ArrayFirstTask {
    public static void main(String[] args) {
    String[] words = {"ребро","Home","Реклама","Words","рука","Фиксики"};
        System.out.println("Слова имещие 5 или меньше символов : ");
        for (int i = 0; i <words.length ; i++) {
            if(words[i].length()<=5){
                System.out.println(words[i]);
            }
        }
        System.out.println(".....................................");
        System.out.println("Слова, которые начинаются с 'р' : ");
        for (int i = 0; i <words.length ; i++) {
            if (words[i].startsWith("р")) {
                System.out.println(words[i]);
            }
        }
        System.out.println(".....................................");
        System.out.println("Слова, которые заканчиваются на 'а' : ");
        for (int i = 0; i <words.length ; i++) {
            if (words[i].endsWith("а")) {
                System.out.println(words[i]);
            }
        }
        System.out.println(".....................................");
         System.out.println("Длина массива : "+words.length);

   }
}
