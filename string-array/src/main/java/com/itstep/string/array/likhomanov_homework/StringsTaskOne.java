package com.itstep.string.array.likhomanov_homework;

import java.util.ArrayList;

public class StringsTaskOne {

    public static void main(String[] args) {

        String[] strings = new String[] {"weed", "apple", "beer", "America",
                                        "butterfly", "pepper", "knife", "Canada",
                                        "week", "painting", "refrigerator", "Australia",
                                        "horse", "profession", "dawn", "Pandora"};
        ArrayList<String> stringsWithNoMoreThanSixLetters = new ArrayList<>();
        ArrayList<String> stringsStartingWithP = new ArrayList<>();
        ArrayList<String> stringsEndingWithA = new ArrayList<>();

        for (String string : strings) {
            if (string.length() <= 5) {
                stringsWithNoMoreThanSixLetters.add(string);
            }

            if (string.startsWith("p")) {
                stringsStartingWithP.add(string);
            }

            if (string.endsWith("a")) {
                stringsEndingWithA.add(string);
            }
        }

        System.out.println("Words " + stringsWithNoMoreThanSixLetters.toString() + " consist of no more than 6 letters");

        System.out.println("Words " + stringsStartingWithP.toString() + " start with \"p\"");

        System.out.println("Words " + stringsEndingWithA.toString() + " end with \"a\"");

        System.out.println("The length of the array is " + strings.length);
    }
}
