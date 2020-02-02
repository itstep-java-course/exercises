package com.itstep.huk_homework_refactor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AgeAppender {
    public void append(String path) throws IOException {
        //вычитывать информацию из файла где будет id И добавить рандомный возраст

        File file = new File(path);
        List<String> rows = new ArrayList<>();
        String line; //буфер
        try (BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(file))){//открываем файл на чтение
            while ((line = bufferedReader.readLine())!=null) {//до теп пор пока вычитаная строка не равна Null
                rows.add(line + getRandomAge());//Добавление всe строки в коллекцию И сразу добавлять в колекцию
            }
        }
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            for (String o : rows) {
                bufferedWriter.write(o);// запись строки в файл
                bufferedWriter.newLine();//переход на новую строку
            }
        }
    }


    private String getRandomAge(){
        Random random = new Random();
        return String.valueOf(random.nextInt(100));//приобразует Int в String
        //return random.nextInt(100)+ " ";//приобразует Int в String
    }
}
