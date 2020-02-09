package com.itstep.chubuk_file_task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AgeAppender {
    public void append(String path) throws IOException {
        File file = new File(path);
        List<String> rows = new ArrayList<>();
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(file))) {
            while ((line = bufferedReader.readLine()) != null) {
                rows.add(line + "; " + getRandomAge());
            }
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (String o : rows) {
                bufferedWriter.write(o);
                bufferedWriter.newLine();
            }
        }
    }
        private String getRandomAge() {
            Random random = new Random();
            return String.valueOf(random.nextInt(89)+10);
        }
}
