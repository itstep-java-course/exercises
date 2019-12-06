package com.itstep.inheritance_exception;

import java.io.File;
import java.io.FileNotFoundException;

public class FileReaderImpl implements FileReader {

    @Override
    public String readFile(File file) throws FileNotFoundException {
        java.io.FileReader reader = new java.io.FileReader(file);

        return null;
    }
}
