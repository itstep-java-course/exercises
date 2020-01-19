package com.itstep;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    public static void main(String[] args) {
//        canNotWriteIntoFileInReadOnlyMode();
//        readWriteModeTest();
        randomAccessExample();
    }

    private static void canNotWriteIntoFileInReadOnlyMode() {
        try (RandomAccessFile randomAccess = new RandomAccessFile("input-output/src/main/java/data/test.txt", "r")) {
            final String line = randomAccess.readLine();
            System.out.println(line);

            randomAccess.writeChars("hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readWriteModeTest() {
        try (RandomAccessFile randomAccess = new RandomAccessFile("input-output/src/main/java/data/test2.txt", "rw")) {
            final String line = randomAccess.readLine();
            System.out.println(line);

            randomAccess.writeBytes("\nhello\nhello");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void randomAccessExample() {
        try (RandomAccessFile randomAccess = new RandomAccessFile("input-output/src/main/java/data/test2.txt", "rw")) {
            randomAccess.writeBytes("Our world is amazing!!!");

            System.out.println("position: " + randomAccess.getFilePointer());

            randomAccess.seek(16);

            System.out.println("position: " + randomAccess.getFilePointer());

            System.out.println((char) randomAccess.readByte());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
