package com.itstep.inheritance_exception;

import java.io.File;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        FileReaderImpl reader = new FileReaderImpl();

       // reader.readFile(new File(""));
    }
}
