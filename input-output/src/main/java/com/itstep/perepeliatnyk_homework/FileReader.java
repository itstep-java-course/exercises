package com.itstep.perepeliatnyk_homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public List<String> fileReader(String path) throws IOException {
        File file = new File(path);
        List<String> list = new ArrayList<>();
        String s;
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))){
            while ((s = reader.readLine()) != null ){
                list.add(s);
            }
        }
        return list;
    }
}
