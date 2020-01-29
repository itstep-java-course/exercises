package com.itstep;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileMethodsExample {
    public static void main(String[] args) throws IOException {
        final File file = new File("input-output/src/main/java/data/test.txt");

//        create directories
        final File dir = new File("input-output/src2/main/java/data");
        dir.mkdirs();

        final boolean absolute = file.isAbsolute();

        System.out.println(absolute);

        final boolean exists = file.exists();
        System.out.println("is file exists: " + exists);

        final String absolutePath = file.getAbsolutePath();
        System.out.println("Absolut path: " + absolutePath);


//        final File file1 = new File("input-output/src/main/java/data/test1.txt");
//        System.out.println(file1.getName());

//        final File file1 = new File("input-output/src/main/java/data/test.txt");
//        System.out.println(file1.length());

//        final File file1 = new File("input-output/src/main/java/data/test.txt");
//        final File parentFile = file1.getParentFile();
//        final String parent = file1.getParent();
//        System.out.println(parentFile);

//        final File file1 = new File("input-output/src/main/java");
//        final String[] list = file1.list();
//        System.out.println(list);
//
//        final File[] files = file1.listFiles();
//        System.out.println(files);

//        final File file1 = new File("input-output/src/main/java");
//        final File[] files = file1.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.startsWith("a");
//            }
//        });
//        final File file1 = new File("input-output/src/main/java");

    }
}
