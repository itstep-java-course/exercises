package com.itstep.staticmethod.huk_homework;

public class Main {

    public static void main(String[] args) {
        final String str = "s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=111111111/final_name.gz";
        String[] str1 = splitString(str);
        printArray(str1);
    }

    private static void printArray(final String[] sstr) {
        String output = String.join(", ", sstr);
        System.out.println(output);
    }

    private static String[] splitString(final String str) {
        String[] sstr = removeProtocol(str).split("/");
        String str1 = findPath(sstr);
        String str2 = findDate(sstr);
        String str3 = findId(sstr);
        String str4 = findFileName(sstr);
        return new String[]{str1, str2, str3, str4};
    }

    private static String removeProtocol(final String str) {
        String[] substrings = str.split("://");
        if (substrings.length > 1) {
            return substrings[1];
        } else {
            return str;
        }
    }

    private static String findPath(final String[] sstr) {
        return sstr[0];
    }

    private static String findDate(final String[] sstr) {
        String year = "", month = "", day = "";
        for (int i = 0; i < sstr.length; i++) {
            if (sstr[i].contains("=")) {
                switch (getKey(sstr[i])) {
                    case "year":
                        year = getValue(sstr[i]);
                        break;
                    case "month":
                        month = getValue(sstr[i]);
                        break;
                    case "day":
                        day = getValue(sstr[i]);
                        break;
                }
            }
        }
        return year + "-" + month + "-" + day;
    }

    private static String findId (final String[] sstr) {
        for (int i = 0; i < sstr.length; i++) {
            if (sstr[i].contains("=") && getKey(sstr[i]).equals("id")) {
                return getValue(sstr[i]);
            }
        }
        return "";
    }

    private static String findFileName (final String[] sstr) {
        for (int i = 0; i < sstr.length; i++) {
            if (sstr[i].contains(".")) {
                return sstr[i];
            }
        }
        return "";
    }

    private static String getKey(final String str) {
        int index = str.indexOf("=");
        return str.substring(0, index);
    }

    private static String getValue(final String str) {
        int index = str.indexOf("=");
        return str.substring(index + 1);
    }

}






/*
public class Main {
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

    private static String getFileName(String source) {
        int lastIndexOfSlash = source.lastIndexOf("/");

        return source.substring(lastIndexOfSlash + 1);
    }
}
*/