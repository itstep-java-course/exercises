package com.itstep.borovoy_homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.List;

 class FileCreator {
     void createFile(String path, List<?> content) throws IOException {

        File file = new File(path);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new java.io.FileWriter(file))) {
            for (Object o : content) {
                bufferedWriter.write(o.toString());
                bufferedWriter.newLine();
            }
        }
    }
}