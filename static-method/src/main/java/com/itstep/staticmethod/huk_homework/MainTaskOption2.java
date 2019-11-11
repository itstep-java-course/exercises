package com.itstep.staticmethod.huk_homework;
/*
1. написать метод который принимает на вход строку и возвращает массив стрингов:

        input string “s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz”


        "s3://part/data/part_path_2/pro/part_path_3/year=2019/month=11/day=04/id=333/file_name.txt"
        "s3://part33/data/part_path_2/processed/part444/year=19/month=11/day=04/id=88/name.gz"

        написать логику которая будет выкусывать из строки такие части: part_path_1, значение id, дату и имя файла с расширением
        логику, которая выкусывает части строки нужно разместить в отдельных методах
        Используйте новые методы внутри главного
        главный метод должен возвращать массив String внутри которого будут 4 строки

        part_path_1
        значение id
        дата в формате YYYY-MM-DD
        имя файла с расширением


        2. написать метод который принимает на вход массив строк (возвращенный первым методом) и выводит их в консоль

        Пример вывода:
        part_path_1, 11111111, 2019-11-04, file_name.gz
*/
        public class MainTaskOption2 {
    public static void main(String[] args) {
        /*
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your string: ");
            String str = in.nextLine();
            in.close();
            System.out.printf("Your string: %s \n", str);
        */
        String source = "s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz";
        //String[] arr = str.split("/+"); //убирает все "/"
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
    /*
    private static void getName (String[]str1) {
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].startsWith("p") && str1[i].endsWith("1")) {
                System.out.println(str1[i]);
            }
        }
    }
     */



    private static String getValueId(String source) {
        String[] parts = source.split("id=");
        String valueIdAndFileName = parts[1];
        return valueIdAndFileName.split("/")[0];
    }
    /*
     for (int i = 0; i < str1.length; i++) {
        if (str1[i].contains("id=")) {
            System.out.println(str1[i].substring(3, str1[i].length()));
        }
    }
     */



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
    /*
      for (int i = 0; i < str1.length; i++) {
        if (str1[i].contains("year=")) {
            System.out.println(str1[i].substring(5, str1[i].length()));
        } else if (str1[i].contains("month=")) {
            System.out.println(str1[i].substring(6, str1[i].length()));
        } else if (str1[i].contains("day=")) {
            System.out.println(str1[i].substring(4, str1[i].length()));
        }
        String str4 =  String.join(" ", str, (CharSequence) str1);
    }
     */


    private static String getFileName(String source) {
        int lastIndexOfSlash = source.lastIndexOf("/");

        return source.substring(lastIndexOfSlash + 1);
    }
    /*
    System.out.println("==================");
        for (int i = 0; i < str1.length; i++) {
        if (str1[i].endsWith(".gz")) {
            System.out.println(str1[i]);
        }
    }
     */
}

