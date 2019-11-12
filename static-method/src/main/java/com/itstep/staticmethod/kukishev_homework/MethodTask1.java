package com.itstep.staticmethod.kukishev_homework;

public class MethodTask1 {


    private static void printParts(String[] nova) {
        for (int i = 0; i < nova.length; i++) {
            System.out.print(nova[i]);
            if (i!= nova.length -1)
                System.out.print(',');

        }

    }





    public static void main (String[] args) {

        String input = "s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz";
        String[] parts = extractAllParts(input);
        printParts(parts);
    }


    private static String[] extractAllParts(String input) {
        String partOne = extractPartOne(input);
        String iD = extractId(input);
        String date = extractDate(input);
        String name = extractFileName(input);

        String[] finalResult = new String[4];
        finalResult[0] = partOne;
        finalResult[1] = iD;
        finalResult[2] = date;
        finalResult[3] = name;
        return finalResult;

    }





    private static String extractPartOne(String input) {
        String [] str1 = input.split("/");
        return str1[2];

    }

    private static String extractId(String input) {
        String [] str1 = input.split("/");
        String [] idValue = new String[2];
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].startsWith("id"))
            idValue = str1[i].split("=");

        }
        return idValue[1];

    }

    private static String extractDate(String input) {
        String[] str1 = input.split("/");
        String[] year = new String[2];
        String[] month = new String[2];
        String[] day = new String[2];
        for (int i = 0; i < str1.length; i++) {

            String element = str1[i];
            if (element.startsWith("year"))
                year = element.split("=");
            if (element.startsWith("month"))
                month = element.split("=");
            if (element.startsWith("day"))
                day = element.split("=");

        }
        String date1 = year[1] + "-" + month[1] + "-" + day[1];
        return date1;

    }

    private static String extractFileName(String input) {
        String[] str1 = input.split("/");
        return str1[str1.length - 1];


    }












}

