package com.itstep.likhomanov_homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class FileReader {

    List<String> readFile(String path) throws IOException {
        File file = new File(path);
        List<String> lines = new ArrayList<>();
        String line;

        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))){
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }
}
