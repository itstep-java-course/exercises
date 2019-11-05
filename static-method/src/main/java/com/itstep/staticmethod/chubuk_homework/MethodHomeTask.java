package com.itstep.staticmethod.chubuk_homework;

public class MethodHomeTask
{
    public static void main(String[] args)
    {
        MethodHomeTask.arrayOutputToConsole(takesStringReturnsArray('-'));
    }
    static String src="s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz";
    public static String[] takesStringReturnsArray(char a)
    {
        String[] array =
                {
                MethodHomeTask.bitePart_path_1(src, 5, 16),
                MethodHomeTask.biteIdValue(src, 82, 93),
                MethodHomeTask.biteDateFormatYYYY(src, 61, 65)+a+
                MethodHomeTask.biteDateFormatMM(src, 72, 74)+a+
                MethodHomeTask.biteDateFormatDD(src, 79, 81),
                MethodHomeTask.biteFileNameWithExtension(src, 94, 106)
                };
        return array;
    }
    public static String bitePart_path_1(String s3, int startIndex, int endIndex)
    {
        return s3.substring(startIndex, endIndex);
    }
    public static String biteIdValue(String s3, int startIndex, int endIndex)
    {
        return s3.substring(startIndex, endIndex);
    }
    public static String biteDateFormatYYYY(String s3, int startIndex, int endIndex)
    {
        return s3.substring(startIndex, endIndex);
    }
    public static String biteDateFormatMM(String s3, int startIndex, int endIndex)
    {
        return s3.substring(startIndex, endIndex);
    }
    public static String biteDateFormatDD(String s3, int startIndex, int endIndex)
    {
        return s3.substring(startIndex, endIndex);
    }
    public static String biteFileNameWithExtension(String s3, int startIndex, int endIndex)
    {
        return s3.substring(startIndex, endIndex);
    }
    public static void arrayOutputToConsole(String[] array)
    {
        for (String i:array)
        {
            System.out.println(i);
        }
    }
}
