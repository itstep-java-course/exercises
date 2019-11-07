package com.itstep.staticmethod.chubuk_homework;

public class MethodHomeTask
{
    public static void main(String[] args)
    {
        MethodHomeTask.arrayOutputToConsole(breaksStringIntoArray("s3://part33/data/part_path_2/processed/part444/year=19/month=11/day=04/id=88/name.gz"));
    }
    public static String[] breaksStringIntoArray(String src)
    {
        int startIndexPart = src.indexOf("s3")+5;
        int endIndexPart = src.indexOf("/data");
        int startIndexId = src.indexOf("id=")+3;
        int endIndexId = src.indexOf("/name");
        int startYear = src.indexOf("year=")+5;
        int endYear = src.indexOf("/month");
        int startMonth = src.indexOf("month=")+6;
        int endMonth = src.indexOf("/day");
        int startDay = src.indexOf("day=")+4;
        int endDay = src.indexOf("/id");
        int indexNameFile = src.lastIndexOf("/")+1;
        int endIndexNameFile = src.indexOf("z")+1;
        String[] array =
                {
                MethodHomeTask.bitePartPath1(src, startIndexPart, endIndexPart),
                MethodHomeTask.biteIdValue(src, startIndexId, endIndexId),
                MethodHomeTask.biteDateFormatYYYYMMDD(src, startYear, endYear, startMonth, endMonth, startDay, endDay),
                MethodHomeTask.biteFileNameWithExtension(src, indexNameFile, endIndexNameFile)
                };
        return array;
    }
    public static String bitePartPath1(String s3, int startIndexPath, int endIndexPath)
    {
        return s3.substring(startIndexPath, endIndexPath);
    }
    public static String biteIdValue(String s3, int startIndexId, int endIndexId)
    {
        return s3.substring(startIndexId, endIndexId);
    }
    public static String biteDateFormatYYYYMMDD(String s3, int startIndexYYY, int endIndexYYY, int startIndexMM, int endIndexMM, int startIndexDD, int endIndexDD)
    {
        return s3.substring(startIndexYYY, endIndexYYY) +'-'+ s3.substring(startIndexMM, endIndexMM) +'-'+ s3.substring(startIndexDD, endIndexDD);
    }
    public static String biteFileNameWithExtension(String s3, int startIndexName, int endIndexName)
    {
        return s3.substring(startIndexName, endIndexName);
    }
    public static void arrayOutputToConsole(String[] array)
    {
        for (String i:array)
        {
            System.out.print(i+", ");
        }
    }
}
