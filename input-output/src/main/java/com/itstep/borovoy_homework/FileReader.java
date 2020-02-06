package com.itstep.borovoy_homework;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

 class FileReader {
     List<String> readFile(String path) throws IOException {
        List<String> list = new ArrayList<>();
        String line;
        File file = new File(path);
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        }
        return list;
    }
}
