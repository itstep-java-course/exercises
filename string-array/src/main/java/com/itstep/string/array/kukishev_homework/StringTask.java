package com.itstep.string.array.kukishev_homework;

public class StringTask {

    public static void main(String[] args) {

        String str = "hello_java_world";

        String[] mass = str.split("_");
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);

        }

        for (int i = 0; i < mass.length; i++){
            System.out.println(mass[i].substring(1, 3));
        }

        for (int i = 0; i < mass.length; i++){
            String str2 = mass[i].replace ("o", "$");
            System.out.println(str2);



        }








    }




}
