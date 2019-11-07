package com.itstep.staticmethod;

public class HomeTaskExample {

    public static void printParts(String[] p) {
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i]);
            if (i != p.length - 1)
                System.out.print(',');
        }
    }

    public static void main(String[] args) {
        String input = "s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz";

        String[] parts = extractParts(input);

        printParts(parts);
    }

    public static String[] extractParts(String input) {
        String partOne = extractPartOne(input);
        String valueId = extractValueId(input);
        String date = extractDate(input);
        String fileName = extractFileName(input);

        String[] result = new String[4];
        result[0] = partOne;
        result[1] = valueId;
        result[2] = date;
        result[3] = fileName;
        return result;
    }

    public static String extractPartOne(String input) {
        String[] allInfo = input.split("/");
        return allInfo[2];
    }

    public static String extractValueId(String input) {
        String[] allInfo = input.split("/");
        String[] idFields = new String[2];
        for (int i = 0; i < allInfo.length; i++) {
            if (allInfo[i].startsWith("id"))
                idFields = allInfo[i].split("=");
        }
        return idFields[1];
    }

    public static String extractDate(String input) {
        String[] allInfo = input.split("/");
        String[] yearStr = new String[2];
        String[] monthStr = new String[2];
        String[] dayStr = new String[2];
        for (int i = 0; i < allInfo.length; i++) {
            String element = allInfo[i];
            if (element.startsWith("year"))
                yearStr = element.split("=");
            if (element.startsWith("month"))
                monthStr = element.split("=");
            if (element.startsWith("day"))
                dayStr = element.split("=");
        }
        String data = yearStr[1] + "-" + monthStr[1] + "-" + dayStr[1];
        return data;
    }

    public static String extractFileName(String input) {
        String[] allInfo = input.split("/");
        return allInfo[allInfo.length - 1];
    }

}
