package com.itstep.staticmethod.perepeliatnyk_homework;


//1. написать метод который принимает на вход строку и возвращает массив стрингов:
//
//        input string “s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz”
//
//        написать логику которая будет выкусывать из строки такие части: part_path_1, значение id, дату и имя файла с расширением
//        логику, которая выкусывает части строки нужно разместить в отдельных методах
//        Используйте новые методы внутри главного
//        главный метод должен возвращать массив String внутри которого будут 4 строки
//
//        part_path_1
//        значение id
//        дата в формате YYYY-MM-DD
//        имя файла с расширением
//
//
//        2. написать метод который принимает на вход массив строк (возвращенный первым методом) и выводит их в консоль
//
//        Пример вывода:
//        part_path_1, 11111111, 2019-11-04, file_name.gz


public class StaticMethodTask {

    public static void main(String[] args) {
        String input = "s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz";

        String[] parts = megaParts(input);

        consoleParts(parts);
    }

    private static String[] megaParts(String input) {
        String partOne = megaPartOne(input);
        String id = megaId(input);
        String date = megaDate(input);
        String fileName = megaFileName(input);

        String[] result = new String[4];
        result[0] = partOne;
        result[1] = id;
        result[2] = date;
        result[3] = fileName;
        return result;
    }

    private static void consoleParts(String[] p) {
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i]);
            if (i != p.length - 1)
                System.out.print(", ");
        }
    }

    private static String megaPartOne(String input) {
        String[] info = input.split("/");
        return info[2];
    }

    private static String megaId(String input) {
        String[] info = input.split("/");
        String[] idFields = new String[2];
        for (int i = 0; i < info.length; i++) {
            if (info[i].startsWith("id"))
                idFields = info[i].split("=");
        }
        return idFields[1];
    }

    private static String megaDate(String input) {
        String[] info = input.split("/");
        String[] strYear = new String[2];
        String[] strMonth = new String[2];
        String[] strDay = new String[2];
        for (int i = 0; i < info.length; i++) {
            String share = info[i];
            if (share.startsWith("year"))
                strYear = share.split("=");
            if (share.startsWith("month"))
                strMonth = share.split("=");
            if (share.startsWith("day"))
                strDay = share.split("=");
        }
        String data = strYear[1] + "-" + strMonth[1] + "-" + strDay[1];
        return data;
    }

    private static String megaFileName(String input) {
        String[] info = input.split("/");
        return info[info.length - 1];
    }

}





