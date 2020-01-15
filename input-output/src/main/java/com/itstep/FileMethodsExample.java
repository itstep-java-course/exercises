package com.itstep;

import java.io.File;
import java.io.IOException;

public class FileMethodsExample {
    public static void main(String[] args) throws IOException {
        final File file = new File("input-output/src/main/java/data/test.txt");

        final boolean exists = file.exists();
        System.out.println("is file exists: " + exists);

        final String absolutePath = file.getAbsolutePath();
        System.out.println("Absolut path: " + absolutePath);
    }
}
