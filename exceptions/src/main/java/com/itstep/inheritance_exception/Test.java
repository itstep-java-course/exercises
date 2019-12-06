package com.itstep.inheritance_exception;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        FileReaderImpl reader = new FileReaderImpl();

        reader.readFile(new File(""));
    }
}
