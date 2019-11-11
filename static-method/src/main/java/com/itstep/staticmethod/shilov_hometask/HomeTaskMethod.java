package com.itstep.staticmethod.shilov_hometask;
class HomeTaskMethod {

    public static void main(String[] args) {
        String src = "s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz";
        printArray(mainMethod(src));
    }

    private static String[] mainMethod(String src) {
        String partPathOne = getPartPath1(src);
        String date = getDate(src);
        String fileName = getFileName(src);
        String valueId = getValueId(src);

        String[] result = {partPathOne, valueId, date, fileName};
        return result;
    }

    private static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print(',');
        }
    }

    private static String getPartPath1(String src) {
        String[] path = src.split("/");
        return path[2];
    }

    private static String getValueId(String src) {
        String[] valueId = src.split("id=");
        String valueIdAndFileName = valueId[1];
        return valueIdAndFileName.split("/")[0];
    }

    private static String getDate(String src) {
        String[] parts = src.split("/");
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

    private static String getFileName(String src) {
        String[] parts = src.split("/");
        return parts[parts.length - 1];
    }

}