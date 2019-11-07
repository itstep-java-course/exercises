package com.itstep.staticmethod.chubuk_homework;

public class MethodHomeTask2 {

    public static String[] convertStringToArray(String text) {
        String[] array = text.split("/");
        String[] arr = new String[4];
        arr[0] = array[2];
        int id = array[10].indexOf("=")+1;
        arr[1] = MethodHomeTask2.cutIdValue(array[10],id);
        int year = array[7].indexOf("=")+1;
        int month = array[8].indexOf("=")+1;
        int day = array[9].indexOf("=")+1;
        arr[2] = MethodHomeTask2.cutYearMonthDay(array[7],year,array[8],month,array[9],day);
        int indexFileName = array.length;
        arr[3] = array[indexFileName-1];
        return arr;
    }
    public static String cutIdValue(String idValue, int startIndex)
    {
        return idValue.substring(startIndex);
    }
    public static String cutYearMonthDay(String arrayOfYear,int indexYear,String arrayOfMonth,int indexMonth,String arrayDay,int indexDay)
    {
        String date = arrayOfYear.substring(indexYear)+"-"+arrayOfMonth.substring(indexMonth)+"-"+arrayDay.substring(indexDay);
        return date;
    }
    public static void arrayPrint(String[] arr)
    {
        for (String i: arr)
        {
            System.out.print(i+", ");
        }
    }
    public static void main(String[] args)
    {
        MethodHomeTask2.arrayPrint(convertStringToArray( "s3://part/data/part_path_2/pro/part_path_3/year=2019/month=11/day=04/id=333/file_name.txt"));
    }
}
