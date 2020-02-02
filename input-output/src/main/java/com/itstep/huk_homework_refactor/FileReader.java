package com.itstep.huk_homework_refactor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public List<String> readFile (String path) throws IOException {// path это ПУТЬ
        List<String> lines = new ArrayList<>();
        String line;
        File file = new File(path);
        try (BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(file))){//открываем файл на чтение
            while ((line = bufferedReader.readLine())!=null) {//до теп пор пока вычитаная строка не равна Null
                lines.add(line);//Добавление всх строк в коллекцию
            }
        }
        return lines;
    }
}
