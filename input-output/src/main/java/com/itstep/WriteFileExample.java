package com.itstep;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

//https://www.baeldung.com/java-write-to-file
//https://stackoverflow.com/questions/2885173/how-do-i-create-a-file-and-write-to-it-in-java
public class WriteFileExample {
    public static void main(String[] args) throws IOException {
        writeToFileJava7Plus();
    }

    public static void whenWriteStringUsingBufferedWriter() throws IOException {
        String str = "Hello";
        BufferedWriter writer = new BufferedWriter(new FileWriter("write_test.txt"));
        writer.write(str);
        writer.write("\n");

        writer.close();
    }

    private static void writeToFileJava7Plus() throws IOException {
        List<String> lines = Arrays.asList("The first line", "The second line");
        Path file = Paths.get("the-file-name.txt");

        Files.write(file, lines, StandardCharsets.UTF_8);
    }

//    close
//    autoclosable
//    error handling
}
