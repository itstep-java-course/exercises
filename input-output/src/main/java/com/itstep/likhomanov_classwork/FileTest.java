package com.itstep.likhomanov_classwork;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) {
        File file = new File("input-output/src/main/java/data/test.txt");

        String name = file.getName();
        System.out.println("File name: " + name);

        String path = file.getPath();
        System.out.println("File's relative path: " + path);

        String absolutePath = file.getAbsolutePath();
        System.out.println("File's absolute path: " + absolutePath);

        String parent = file.getParent();
        System.out.println("File's parent: " + parent);

        System.out.println(file.exists() ? "File exists" : "File doesn't exist");

        System.out.println(file.canWrite() ? "File is writable" : "File is not writable");

        System.out.println(file.canRead() ? "File is readable" : "File is not readable");

        System.out.println(file.isDirectory() ? "File is directory" : "File is not directory");

        System.out.println(file.isFile() ? "File is file" : "File is not file");

        System.out.println(file.isAbsolute() ? "File is absolute" : "File is not absolute");

        System.out.println(file.canExecute() ? "File is executable" : "File is not executable");

        long time = file.lastModified();
        System.out.println("File was last modified: " + time);

        long length = file.length();
        System.out.println("File's size: " + length + "B");

        long totalSpace = file.getTotalSpace();
        System.out.println("File's total space: " + totalSpace + "B");

//        file.renameTo(new File("input-output/src/main/java/data/test.txt"));

//        file.delete();

        File newFile = new File("input-output/src/main/java/data/test1.txt");
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
