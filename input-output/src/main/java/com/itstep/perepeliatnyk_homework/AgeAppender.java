package com.itstep.perepeliatnyk_homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AgeAppender {

    public void append(String path) throws IOException {
        File file = new File(path);
        List<String> list = new ArrayList<>();
        String s;
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))) {
            while ((s = reader.readLine()) != null) {
                list.add(s + getAge());
            }
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            for (String line : list) {
                writer.write(line);
                writer.newLine();

            }
        }
    }

    private int getAge() {
        Random random = new Random();
        return random.nextInt(50);

    }
}
