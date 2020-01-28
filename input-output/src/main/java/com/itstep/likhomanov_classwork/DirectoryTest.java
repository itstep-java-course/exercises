package com.itstep.likhomanov_classwork;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DirectoryTest {

    public static void main(String[] args) {
        File dir = new File("input-output/src/main/java/com/itstep");

        String name = dir.getName();
        System.out.println("File name: " + name);

        String path = dir.getPath();
        System.out.println("File's relative path: " + path);

        String absolutePath = dir.getAbsolutePath();
        System.out.println("File's absolute path: " + absolutePath);

        String parent = dir.getParent();
        System.out.println("File's parent: " + parent);

        System.out.println(dir.exists() ? "File exists" : "File doesn't exist");

        System.out.println(dir.canWrite() ? "File is writable" : "File is not writable");

        System.out.println(dir.canRead() ? "File is readable" : "File is not readable");

        System.out.println(dir.isDirectory() ? "File is directory" : "File is not directory");

        System.out.println(dir.isFile() ? "File is file" : "File is not file");

        System.out.println(dir.isAbsolute() ? "File is absolute" : "File is not absolute");

        System.out.println(dir.canExecute() ? "File is executable" : "File is not executable");

        long time = dir.lastModified();
        System.out.println("File was last modified: " + time);

        long length = dir.length();
        System.out.println("File's size: " + length + "B");

        System.out.println();
        System.out.println("Without filter");

        String[] files = dir.list();

        for (String file : files) {
            System.out.println(file);
        }

        System.out.println();

        File[] listOfFiles = dir.listFiles();

        for (File file : listOfFiles) {
            if (file.isDirectory()) System.out.println(file.getName() + " is directory");
            else System.out.println(file.getName() + " is file");
        }

        System.out.println();
        System.out.println("With filter");

        String[] filteredList = dir.list((dir1, name1) -> name1.endsWith(".java"));

        List<String> arrayList = Arrays.asList(filteredList);
        arrayList.sort(Collections.reverseOrder());

        for (String file : filteredList) {
            System.out.println(file);
        }

        System.out.println();

        File[] filteredFiles = dir.listFiles((dir2, name2) -> !name2.contains("."));

        for (File file : filteredFiles) {
            System.out.println(file.getName());
        }

        File newDirs = new File("input-output/src/main/java/newFolderOne/newFolderTwo");
        File newDir = new File("input-output/src/main/java/newFolder");

        if (!newDir.exists()) newDir.mkdir();

        if (!newDirs.exists()) newDirs.mkdirs();
    }
}
