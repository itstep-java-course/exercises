package shilov_classwork;

class Shilov_method_homework {
    public static void main(String[] args) {

        String str = "s3://part_path_1/data/part_path_2/processed/part_path_3/year=2019/month=11/day=04/id=11111111/file_name.gz";

        String[] str1 = str.split("/");
        System.out.println("Return value: ");
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }

        for (int i = 0; i < str1.length; i++) {
            if (str1[i].startsWith("p") && str1[i].endsWith("1")) {
                System.out.println(str1[i]);
            }
        }

        for (int i = 0; i < str1.length; i++) {
            if (str1[i].contains("id=")) {
                System.out.println(str1[i].substring(3, str1[i].length()));
            }
        }

        for (int i = 0; i < str1.length; i++) {
            if (str1[i].endsWith(".gz")) {
                System.out.println(str1[i]);
            }
        }

    }
}
