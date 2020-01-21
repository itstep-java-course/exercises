package com.itstep;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

//https://www.baeldung.com/java-read-file
public class ReadFileExample {
    public static void main(String[] args) throws IOException, URISyntaxException {
        readAllBytesOldSchool();
    }

    private static void readAllBytesOldSchool() {
        final File file = new File("input-output/src/main/java/data/test.txt");
        if (file.exists()) {
//            FileInputStream inputStream = null;
//            try {
//                inputStream = new FileInputStream(file);
//                int x;
//                int[] bytes = new int[(int) file.length()];
//                int index = 0;
//                while ((x = inputStream.read()) != -1) {
//                    bytes[index] = x;
//                    index++;
//                }
//                System.out.println(bytes);
//            } catch (IOException e) {
//                System.out.println("logs");
//            } finally {
//                try {
//                    inputStream.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }

            try (FileInputStream inputStream = new FileInputStream(file)) {
                int x;
                int[] bytes = new int[(int) file.length()];
                int index = 0;
                while ((x = inputStream.read()) != -1) {
                    bytes[index] = x;
                    index++;
                }
                System.out.println(bytes);
            } catch (IOException e) {
                System.out.println("logs");
            }
        }
    }

    private static void readAllBytes() throws IOException, URISyntaxException {
        final File file = new File("input-output/src/main/java/data/test.txt");
        final byte[] bytes = Files.readAllBytes(file.toPath());

        System.out.println(bytes);
    }

    private static void readFileLineByLineOldSchool() throws IOException {
        final File file = new File("input-output/src/main/java/data/test.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            List<String> lines = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            System.out.println(lines);
        }
    }

    private static void readFileLineByLine() throws IOException {
        final File file = new File("input-output/src/main/java/data/test.txt");
//        только для маленьких файлов
        final List<String> lines = Files.readAllLines(file.toPath());

        System.out.println(lines);
    }

    private static class MyClosable implements AutoCloseable {

        @Override
        public void close() throws Exception {
            System.out.println("close");
        }
    }

    private static class Base {
        void m1() {

        }

        void m2() {

        }
    }

    private static class StringDecorator {
        private final String base;

        private StringDecorator(String base) {
            this.base = base;
        }

        void m1() {
//            base.toCharArray()[6];
        }

        void m2() {
//            base.m2();
        }

        void m3() {

        }

    }

//    close reader
//    autoclosable
//    close example
}
