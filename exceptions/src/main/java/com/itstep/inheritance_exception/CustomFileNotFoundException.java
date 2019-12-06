package com.itstep.inheritance_exception;

import java.io.FileNotFoundException;

public class CustomFileNotFoundException extends FileNotFoundException {
    public CustomFileNotFoundException(String s) {
        super(s);
    }
}
