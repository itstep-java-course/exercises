package com.itstep.staticmethod.safankov_homework;

public class StaticMethodTask {
    private static String[] cutOnParts(String input) {
        String partPath = cutPartPath(input);
        String valueId = cutValueId(input);
        String date = cutDate(input);
        String fileName = cutFileName(input);
        String[] result = new String[]{partPath, valueId, date, fileName};
        return result;
    }
    private static String cutPartPath(String input) {
        String[] allInfo = input.split("/");
        return allInfo[2];
    }
    private static String cutValueId(String input) {
        String[] allInfo = input.split("/");
        String[] idFields = new String[]{};
        for (int i = 0; i < allInfo.length; i++) {
            if (allInfo[i].contains("id"))
                idFields = allInfo[i].split("=");
        }
        return idFields[1];
    }
    private static String cutDate(String input) {
        String[] allInfo = input.split("/");
        String[] yearStr = new String[]{};
        String[] monthStr = new String[]{};
        String[] dayStr = new String[]{};
        for (int i = 0; i < allInfo.length; i++) {
            String element = allInfo[i];
            if (element.contains("year"))
                yearStr = element.split("=");
            if (element.contains("month"))
                monthStr = element.split("=");
            if (element.contains("day"))
                dayStr = element.split("=");
        }
        String date = yearStr[1] + "-" + monthStr[1] + "-" + dayStr[1];
        return date;
    }
    private static void printParts(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print(',');
        }
    }
    private static String cutFileName(String input) {
        int lastIndexOfSlash = input.lastIndexOf("/");
        return input.substring(lastIndexOfSlash + 1);
    }
    public static void main(String[] args) {
        String text = "s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz";
        String[] parts = cutOnParts(text);
        printParts(parts);
    }

}

