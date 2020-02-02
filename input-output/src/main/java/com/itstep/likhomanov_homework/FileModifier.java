package com.itstep.likhomanov_homework;

import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class FileModifier {

    void modify(String path, Action action) throws IOException {
        File file = new File(path);
        List<String> lines = new ArrayList<>();
        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            lines = action.apply(lines);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            for (String finalLine : lines) {
                writer.write(finalLine);
                writer.newLine();
            }
        }
    }
}
