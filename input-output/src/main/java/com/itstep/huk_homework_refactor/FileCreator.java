package com.itstep.huk_homework_refactor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileCreator {
    public void createFile(String path, List<?> content) throws IOException {
        File file = new File(path);
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            for (Object o : content) {
                bufferedWriter.write(o.toString());// запись строки в файл
                bufferedWriter.newLine();//переход на новую строку
            }
        }
    }
}
