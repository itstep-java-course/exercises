package com.itstep.likhomanov_classwork;

import java.io.*;

public class FileWriterTest {

    public static void main(String[] args) {
        String source = "Now is the time for all good men \n" +
                "to come to the aid of their country \n" +
                "and pay their due taxes.";

        File testFile = new File("input-output/src/main/java/data/test.txt");

        /* Rewrites all existing data in an opened file */
//        try(FileWriter writer = new FileWriter(testFile)) {
//            char[] chars = source.toCharArray();
//            writer.write(chars);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        /* Append mode - writes new data at the end of an open file, all existing data is not affected */
//        try(FileWriter writer = new FileWriter(testFile, true)) {
//            char[] chars = source.toCharArray();
//            writer.write(chars);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        File newFile = new File("input-output/src/main/java/data/newFile.txt");
//        /* If there is an attempt to write data to a not existing file,
//        the file is initially created and data is written to it afterwards */
//        try(FileWriter writer = new FileWriter(newFile)) {
//            /* It's possible to write an entire Sting */
//            writer.write(source);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File newFile = new File("input-output/src/main/java/data/newFile.txt");
        /* If there is an attempt to write data to a not existing file,
        the file is initially created and data is written to it afterwards */
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(newFile))) {
            /* It's possible to write an entire Sting */
            writer.write(source);
            writer.newLine();
            writer.write(source);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
