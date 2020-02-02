package com.itstep.stahov_homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatorFile {
    private Write write = null;

    private File writeStringUsing1(File file1) throws IOException {
        String str1 = "1;Petr;Maksimov\n" +
                "5;Ivan;Egorov\n" +
                "2;Petr;Rakul\n" +
                "3;Miha;Dobkin\n" +
                "4;Danil;Maksimov";
        try (BufferWriter writer = new BufferWriter(new FileWriter("input-output/src/main/java/com/itstep/strahov_homework/myData/text1.txt"))) {
            write.write(str1);
            write.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                write.close();
            } catch (Exception ex) {
            }
        }
        return file1;
    }
    private  FilewriteStringUsing2(File file2) {
        String str2 = "1;Gagarina;25\n" +
                "2;Pushkina;17\n" +
                "4;Nauki;7\n" +
                "5;Bajana;33\n" +
                "3;Derjavinska;18";
        try (BufferWriter writer = new BufferWriter(new FileWriter("input-output/src/main/java/com/itstep/strahov_homework/myData/text2.txt"))) {
            writer.write(str2);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (Exception ex) {
            }
        }
        return file2;
    }
    public static void main(String[] args) throws IOException {
        final File dir = new File("input-output/src/main/java/com/itstep/strahov_homework/myData");
        dir.mkdirs();


        final File file1 = new File("input-output/src/main/java/com/itstep/strahov_homework/myData/text1.txt");
        final File file2 = new File("input-output/src/main/java/com/itstep/strahov_homework/myData/text2.txt");
        file1.createNewFile();
        file2.createNewFile();


        FileCreator fileCreator = new FileCreator();
        fileCreator. FilewriteStringUsing1(file1);
        fileCreator. FilewriteStringUsing2(file2);


    }


}
}
