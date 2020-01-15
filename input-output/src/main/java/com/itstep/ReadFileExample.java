package com.itstep;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ReadFileExample {
    public static void main(String[] args) throws IOException, URISyntaxException {
        readFileLineByLine();
    }

    private static void readAllBytesOldSchool() throws IOException {
        final File file = new File("input-output/src/main/java/data/test.txt");
        if (file.exists()) {
            final FileInputStream inputStream = new FileInputStream(file);
            int x = 0;
            int[] bytes = new int[(int) file.length()];
            int index = 0;
            while ((x = inputStream.read()) != -1) {
                bytes[index] = x;
                index++;
            }

            System.out.println(bytes);
        }
    }

    private static void readAllBytes() throws IOException, URISyntaxException {
        final File file = new File("input-output/src/main/java/data/test.txt");
        final byte[] bytes = Files.readAllBytes(file.toPath());

        System.out.println(bytes);
    }

    private static void readFileLineByLineOldSchool() throws IOException {
        final File file = new File("input-output/src/main/java/data/test.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line;
        List<String> lines = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }

        System.out.println(lines);
    }

    private static void readFileLineByLine() throws IOException {
        final File file = new File("input-output/src/main/java/data/test.txt");
        final List<String> lines = Files.readAllLines(file.toPath());

        System.out.println(lines);
    }

//    close reader
//    autoclosable
//    close example
}
