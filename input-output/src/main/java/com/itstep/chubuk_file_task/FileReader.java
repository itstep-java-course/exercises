package com.itstep.chubuk_file_task;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public List<String> readFile(String path) throws IOException{
            List<String> lines = new ArrayList<>();
            String line;
            File file = new File(path);
            try (BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(file))){
                while ((line = bufferedReader.readLine())!=null) {
                    lines.add(line);
                }
            }
            return lines;
    }
}
