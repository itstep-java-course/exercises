package com.itstep.staticmethod.shnurenko_hometask;

public class StringParser {

    public static void main(String[] args) {
        String source = "s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz";

        String[] arr = parseString(source);

        printArray(arr);
    }

    private static String[] parseString(String source) {
        String partOne = getPartOne(source);
        String date = getDate(source);
        String fileName = getFileName(source);
        String valueId = getValueId(source);

        return new String[]{partOne, valueId, date, fileName};
    }

    private static void printArray(String[] arr) {
        String result = "";
        for (String s : arr) {
            result += s + ",";
        }
        System.out.println(result.substring(0, result.length() - 1));
    }

    private static String getPartOne(String source) {
        String[] parts = source.split("/");
        return parts[2];
    }

    private static String getValueId(String source) {
        String[] parts = source.split("id=");
        String valueIdAndFileName = parts[1];
        return valueIdAndFileName.split("/")[0];
    }


    private static String getDate(String source) {
        String[] parts = source.split("/");
        String year = "";
        String month = "";
        String day = "";
        for (String part : parts) {
            if (part.startsWith("year")) {
                year = part.split("=")[1];
            }
            if (part.startsWith("month")) {
                month = part.split("=")[1];
            }
            if (part.startsWith("day")) {
                day = part.split("=")[1];
            }
        }
        return year + '-' + month + '-' + day;
    }

    private static String getDatePartValue(String part, String partName) {

        return "";
    }

    private static String getFileName(String source) {
        int lastIndexOfSlash = source.lastIndexOf("/");

        return source.substring(lastIndexOfSlash + 1);
    }
}
