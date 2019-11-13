package com.itstep.staticmethod.srtahov_homework;

public class Task1 {
    public static void main(String[] args) {
        String input = "s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz";
        String[] patch = Patch(input);
        outPatch(patch);
    }

    public static String[] Patch(String input) {
        String patchOne = getMass(input);
        String patchTwo = getId(input);
        String patchThree = getData(input);
        String patchFour = fullFileName(input);
        String[] result = new String[4];
        result[0] = getMass(input);
        result[1] = getId(input);
        result[2] = getData(input);
        result[3] = fullFileName(input);
        return result;
    }

    private static String getId(String input) {
        String[] allinf = input.split("/");
        String[] giveId = new String[2];
        for (int i = 0; i < allinf.length; i++) {
            if (allinf[i].startsWith("id"))
                giveId = allinf[i].split("=");
        }
        return giveId[1];
    }

    public static String getMass(String input) {
        String[] allinfo = input.split("/");
        return allinfo[2];
    }


    public static String getData(String input) {
        String[] allinfo = input.split("/");
        String[] day = new String[2];
        String[] month = new String[2];
        String[] year = new String[2];
        for (int i = 0; i < allinfo.length; i++) {
            String el = allinfo[i];
            if (allinfo[i].startsWith("day"))
                day = el.split("day=");
            if (allinfo[i].startsWith("day"))
                month = el.split("month=");
            if (allinfo[i].startsWith("day"))
                year = el.split("year=");
        }
        String data = day[0] + "-" + month[0] + "-" + year[0];
        return data;
    }

    private static String fullFileName(String input) {
        String[] allinfo = input.split("/");
        return allinfo[allinfo.length - 1];
    }

    public static void outPatch(String[] allout) {
        for (int i = 0; i < allout.length; i++) {
            System.out.println(allout[i]);
            if (i != allout.length - 1)
                System.out.print(',');
        }

    }
}
