package com.itstep.borovoy_homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCreator {
    private Writer writer = null;

    private File whenWriteStringUsingBufferedWriter1(File file1) {
        String str = "1;Petr;Maksimov\n" +
                "5;Ivan;Egorov\n" +
                "2;Petr;Rakul\n" +
                "3;Miha;Dobkin\n" +
                "4;Danil;Maksimov";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("input-output/src/main/java/com/itstep/borovoy_homework/myData/text1.txt"))) {
            writer.write(str);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (Exception ex) {

            }
        }
        return file1;

    }

   private File whenWriteStringUsingBufferedWriter2(File file2) {
        String str = "1;Gagarina;25\n" +
                "2;Pushkina;17\n" +
                "4;Nauki;7\n" +
                "5;Bajana;33\n" +
                "3;Derjavinska;18";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("input-output/src/main/java/com/itstep/borovoy_homework/myData/text2.txt"))) {
            writer.write(str);
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
        final File dir = new File("input-output/src/main/java/com/itstep/borovoy_homework/myData");
        dir.mkdirs();


        final File file1 = new File("input-output/src/main/java/com/itstep/borovoy_homework/myData/text1.txt");
        final File file2 = new File("input-output/src/main/java/com/itstep/borovoy_homework/myData/text2.txt");
        file1.createNewFile();
        file2.createNewFile();


        FileCreator fileCreator = new FileCreator();
        fileCreator.whenWriteStringUsingBufferedWriter1(file1);
        fileCreator.whenWriteStringUsingBufferedWriter2(file2);


    }


}
