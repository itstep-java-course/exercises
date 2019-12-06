package com.itstep.checked;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
//        File file = new File("/Users/test.txt");
//
//        try {
//            FileInputStream fileInputStream = new FileInputStream(file);
//
//
//            System.out.println("сюда не дойдет");
//        } catch (FileNotFoundException e) {
//            System.out.println("ты баран. нет такого файла");
//        } finally {
//
//        }
        stringCounterClient();

        double calculate = calculate(0, 3);
        System.out.println(calculate);
    }

    private static void stringCounterClient() {
        File file = new File("/Users/test.txt");

        try {
            getStringsCount(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    private static int getStringsCount(File file) throws FileNotFoundException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
//            логика подсчета строк
            return 10;
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//    private static double calculate(double x1, double x2) {
//        return x1 / x2;
//    }

    private static double calculate(int x1, int x2) {
        return x1 / x2;
    }
}
