
package com.itstep.staticmethod.huk_homework;

//import java.util.Scanner;

/*
1. написать метод который принимает на вход строку и возвращает массив стрингов:

        input string “s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz”

        написать логику которая будет выкусывать из строки такие части: part_path_1, значение id, дату и имя файла с расширением
        логику, которая выкусывает части строки нужно разместить в отдельных методах
        Используйте новые методы внутри главного
        главный метод должен возвращать массив String внутри которого будут 4 строки

        part_path_1
        значение id
        дата в формате YYYY-MM-DD
        имя файла с расширением

        Пример вывода:
        part_path_1, 11111111, 2019-11-04, file_name.gz

*/
public class StaticMethodInStringOutArrayString {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter your string: ");
//        String str = in.nextLine();
//        in.close();
//        System.out.printf("Your string: %s \n", str);

        String str = "s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz";

        //regex — разграничение регулярного выражения;
        //limit — порог, результатом которого означает, как
        // строк, должно быть возвращено

        String[] str1 = str.split("/");
        System.out.println("Return value: ");
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }

        //        for (String y: str1)
//        {
//            System.out.println(y);
//        }


        //String str = "s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz";
        System.out.println("==================");
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].startsWith("p") && str1[i].endsWith("1")) {
                System.out.println(str1[i]);
            }
        }





//String str = "s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz";
        System.out.println("==================");
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].contains("id=")) {
                System.out.println(str1[i].substring(3, str1[i].length()));
            }
        }





//String str = "s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz";

        System.out.println("==================");
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].endsWith(".gz")) {
                System.out.println(str1[i]);
            }
        }








        System.out.println("==================");
//        for (int i = 0; i < str1.length; i++) {
//            if (str1[i].contains("year=") && (str1[i].contains("month=")) && (str1[i].contains("day="))){
//                System.out.println(str1[i].replace("year=", ""));
//                System.out.println(str1[i].replace("month=", "-"));
//                System.out.println(str1[i].replace("day=", "-"));
//            }
        /*
        for (int i = 0; i <str1.length ; i++) {
            String[] str3 = str.split("=");
            System.out.println(str3[i].split(4, str3[i].length()));
        }
        */


        //String str = "s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz";
/*
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].contains("year=")) {
                System.out.println(str1[i].substring(5, str1[i].length()));
            } else if (str1[i].contains("month=")) {
                System.out.println(str1[i].substring(6, str1[i].length()));
            } else if (str1[i].contains("day=")) {
                System.out.println(str1[i].substring(4, str1[i].length()));
            }

        }
        */

    }
}











