package com.itstep.borovoy_homework;

import java.io.File;

public class TestFileInput {

    public static void main(String[] args) {
        FileWriter fileWriter = new FileWriter();
        final File dir = new File("input-output/src/main/java/com/itstep/borovoy_homework/myData");
        dir.mkdirs();
        fileWriter.write();
    }
}
