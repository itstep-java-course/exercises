package com.itstep.staticmethod.shyrkov_homework;

public class Task1 {
    public static void main(String[] args) {
        String mainString = "s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz";
        String[] resultArray = extractStrings(mainString);
        printResult(resultArray);
        String anotherMainString = "s3://part/data/part_path_2/pro/part_path_3/year=2019/month=11/day=04/id=333/file_name.txt";
        String anotherMoreMainString = "s3://part33/data/part_path_2/processed/part444/year=19/month=11/day=04/id=88/name.gz";
        printResult(extractStrings(anotherMainString));
        printResult(extractStrings(anotherMoreMainString));
    }

    private static void printResult(String[] resultArray) {
        for (int i = 0; i < resultArray.length; i++) {
            if (i != resultArray.length - 1)
                System.out.print(resultArray[i] + ", ");
            else
                System.out.println(resultArray[i]);
        }
    }

    private static String[] extractStrings(String mainStr) {
        return new String[]{getPath(mainStr), getId(mainStr), getDate(mainStr), getName(mainStr)};
    }

    private static String getPath(String str) {
        String[] strsArray = str.split("/");
        return strsArray[2];
    }

    private static String getId(String str) {
        String[] strsArray = str.split("/");
        String res = "";
        for (String s : strsArray) {
            if (s.startsWith("id=")) {
                res = s.substring(3);
                break;
            }
        }
        return res;
    }

    private static String getDate(String str) {
        String[] strsArray = str.split("/");
        String res = "";
        res += getYear(strsArray) + "-" + getMonth(strsArray) + "-" + getDay(strsArray);
        return res;
    }

    private static String getName(String str) {
        String[] strsArray = str.split("/");
        return strsArray[strsArray.length - 1];
    }

    private static String getYear(String[] strsArray) {
        String res = "";
        for (String s : strsArray) {
            if (s.startsWith("year=")) {
                res = s.substring(5);
                break;
            }
        }
        return res;
    }

    private static String getMonth(String[] strsArray) {
        String res = "";
        for (String s : strsArray) {
            if (s.startsWith("month=")) {
                res = s.substring(6);
                break;
            }
        }
        return res;
    }

    private static String getDay(String[] strsArray) {
        String res = "";
        for (String s : strsArray) {
            if (s.startsWith("day=")) {
                res = s.substring(4);
                break;
            }
        }
        return res;
    }
}
