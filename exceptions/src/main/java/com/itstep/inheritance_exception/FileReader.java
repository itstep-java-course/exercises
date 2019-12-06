package com.itstep.inheritance_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileReader {

    String readFile(File file) throws IOException;
}
