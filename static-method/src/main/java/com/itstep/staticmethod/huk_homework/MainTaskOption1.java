package com.itstep.staticmethod.huk_homework;


public class MainTaskOption1 {

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








