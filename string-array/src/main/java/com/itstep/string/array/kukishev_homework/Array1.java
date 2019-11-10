package com.itstep.string.array.kukishev_homework;

public class Array1 {
    public static void main(String[] args) {



        String[] mass = new String[]{"venus", "mars", "earth", "jupiter"};

        for (int i = 0; i < mass.length; i++)
            if (mass[i].length() <= 5)
                System.out.println(mass[i]);


        for (int i = 0; i < mass.length; i++)
            if (mass[i].startsWith("v"))
                System.out.println(mass[i]);

        for (int i = 0; i < mass.length; i++)
            if (mass[i].endsWith("s"))
                System.out.println(mass[i]);


               System.out.println(mass.length);

    }



}
