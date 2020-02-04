package com.itstep.perepeliatnyk_homework;

import java.io.*;
import java.util.List;

public class FileCreator {

    public void createFile(String path, List<?> data) throws IOException {
        File file = new File(path);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            for (Object line : data) {
                writer.write(line.toString());
                writer.newLine();

            }
        }
    }
}
