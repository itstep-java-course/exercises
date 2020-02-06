package com.itstep.borovoy_homework;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


 class AgeAppender {
     void append(String path) throws IOException {
        File file = new File(path);
        List<String> strings = new ArrayList<>();
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(file))) {
            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line + generateRandomAge());

            }
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new java.io.FileWriter(file))) {
            for (String o : strings) {
                bufferedWriter.write(o);
                bufferedWriter.newLine();

            }

        }
    }

    private String generateRandomAge() {
        Random random = new Random();
        return "" + random.nextInt(70);

    }
}
