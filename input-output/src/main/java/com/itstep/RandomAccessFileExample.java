package com.itstep;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.*;
import java.util.Map.Entry;

public class RandomAccessFileExample {
    public static void main(String[] args) {
//        canNotWriteIntoFileInReadOnlyMode();
//        readWriteModeTest();
//        randomAccessExample();
        sortByValues();
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

    private static void sortByValues() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "2");
        map.put("2", "3");
        map.put("3", "1");

        final Set<Entry<String, String>> entries = map.entrySet();
        final List<Entry<String, String>> entriesList = new ArrayList<>(entries);
        entriesList.sort(new Comparator<Entry<String, String>>() {
            @Override
            public int compare(Entry<String, String> o1, Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        Map<String, String> sortedByValue = new LinkedHashMap<>();
        for (Entry<String, String> entry : entriesList) {
            sortedByValue.put(entry.getKey(), entry.getValue());
        }

        List<? extends Number> l1 = new ArrayList<>();



//        List<T> l2 = new ArrayList<>();

        System.out.println(sortedByValue);

    }

    private class Whether implements Serializable {



    }
}
