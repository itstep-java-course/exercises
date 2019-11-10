package com.itstep.staticmethod.likhomanov_homework;

public class StaticMethodsTask {

    public static void main(String[] args) {

        String inputString = "s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz";
//        String inputString = "s3://part/data/part_path_2/pro/part_path_3/year=2019/month=11/day=04/id=333/file_name.txt";
//        String inputString = "s3://part33/data/part_path_2/processed/part444/year=19/month=11/day=04/id=88/name.gz";

        printMetaData(fetchMetaData(inputString));
    }

    private static String fetchPartOne(String sourceString) {
        String[] strings = sourceString.split("/");
        return strings[2];
    }

    private static String fetchIdNumber (String sourceString) {
        String[] strings = sourceString.split("/");

        for (String string : strings) {
            if (string.startsWith("id=")) return string.split("=")[1];
        }
        return "id not found";
    }

    private static String fetchDate (String sourceString) {
        String[] strings = sourceString.split("/");
        String year = "YYYY";
        String month = "MM";
        String day = "DD";

        for (String string : strings) {
            if (string.startsWith("year=")) year = string.split("=")[1];

            if (string.startsWith("month=")) month = string.split("=")[1];

            if (string.startsWith("day=")) day = string.split("=")[1];
        }
        return year + "-" + month + "-" + day;
    }

    private static String fetchFileName (String sourceString) {
        String[] strings = sourceString.split("/");
        return strings[strings.length - 1];
    }

    private static String[] fetchMetaData(String sourceString) {
        return new String[]{
                fetchPartOne(sourceString),
                fetchIdNumber(sourceString),
                fetchDate(sourceString),
                fetchFileName(sourceString)
        };
    }

    private static void printMetaData(String[] sourceStrings) {
        for (int index = 0; index < sourceStrings.length; index++) {
            if (index == sourceStrings.length - 1) System.out.println(sourceStrings[index]);
            else System.out.print(sourceStrings[index] + ", ");
        }
    }
}
