package com.itstep.staticmethod.dudkin_homework;

public class Task {
    private static String[] mainMethod(String mainStr) {
        String[] str = mainStr.split("//");
        String[] result = {getPath(str[1]), getId(str[1]), getData(str[1]), getName(str[1])};
        return result;
    }

    private static String getPath(String str1) {
        String[] allInfo = str1.split("/");
        return allInfo[0];
    }

    private static String getId(String str1) {
        String[] allInfo = str1.split("/");
        String[] idFields = new String[2];
        for (int i = 0; i < allInfo.length; i++) {
            if (allInfo[i].startsWith("id"))
                idFields = allInfo[i].split("=");
        }
        return idFields[1];
    }

    private static String getData(String str1) {
        String[] allInfo = str1.split("/");
        String[] yearStr = new String[2];
        String[] monthStr = new String[2];
        String[] dayStr = new String[2];
        for (int i = 0; i < allInfo.length; i++) {
            if (allInfo[i].startsWith("year"))
                yearStr = allInfo[i].split("=");
            if (allInfo[i].startsWith("month"))
                monthStr = allInfo[i].split("=");
            if (allInfo[i].startsWith("day"))
                dayStr = allInfo[i].split("=");
        }
        String data = yearStr[1] + "-" + monthStr[1] + "-" + dayStr[1];
        return data;
    }

    private static String getName(String str1) {
        String[] allInfo = str1.split("/");
        return allInfo[allInfo.length - 1];
    }

    public static void showResult(String[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1)
                System.out.print(',');
        }
    }

    public static void main(String[] args) {
        String info = "s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz";
        showResult(mainMethod(info));
    }
}
