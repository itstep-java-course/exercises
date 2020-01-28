package com.itstep.likhomanov_homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader implements FileHandler {

    List<String> readFileWithNames() {
        return readFile(NAMES_PATH);
    }

    List<String> readFileWithAddresses() {
        return readFile(ADDRESSES_PATH);
    }

    @Override
    public List<String> readFile(String path) {
        File file = new File(path);
        List<String> lines = new ArrayList<>();
        String line;

        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))){
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return lines;
    }
}
