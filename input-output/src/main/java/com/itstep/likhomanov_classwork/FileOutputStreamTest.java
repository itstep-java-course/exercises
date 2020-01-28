package com.itstep.likhomanov_classwork;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    public static void main(String[] args) {
        String source = "Now is the time for all good men \n" +
                "to come to the aid of their country \n" +
                "and pay their due taxes.";

        File testFile = new File("input-output/src/main/java/data/test.txt");

        /* Rewrites all existing data in an opened file */
//        try(FileOutputStream stream = new FileOutputStream(testFile)) {
//            byte[] bytes = source.getBytes();
//            stream.write(bytes);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        /* Append mode - writes new data at the end of an open file, all existing data is not affected */
        try(FileOutputStream stream = new FileOutputStream(testFile, true)) {
            byte[] bytes = source.getBytes();
            stream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        File newFile = new File("input-output/src/main/java/data/newFile.txt");
        /* If there is an attempt to write data to a not existing file,
        the file is initially created and data is written to it afterwards */
        try(FileOutputStream stream = new FileOutputStream(newFile)) {
            byte[] bytes = source.getBytes();
            stream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
