package com.itstep.safankov_homework;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
public class FileCreator {
    public void createFile(String path, List<?> content) throws IOException {
        File file = new File(path);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (Object o : content) {
                bufferedWriter.write(o.toString());
                bufferedWriter.newLine();
            }
        }
    }
}