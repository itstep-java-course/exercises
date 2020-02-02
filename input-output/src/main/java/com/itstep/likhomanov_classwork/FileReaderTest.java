package com.itstep.likhomanov_classwork;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReaderTest {

    public static void main(String[] args) {
        File file = new File("input-output/src/main/java/data/test.txt");

        try (FileReader reader = new FileReader(file)){
            int ch;
            while ((ch = reader.read()) != -1) System.out.print((char) ch + " ");
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader reader = new FileReader(file)){
            int ch;
            reader.skip(20);
            while ((ch = reader.read()) != -1) System.out.print((char) ch + " ");
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = reader.readLine()) != null) System.out.print(line + " ");
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
