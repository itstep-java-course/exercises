package com.itstep.likhomanov_homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

class FileCreator {

    void createFile(String path, List<?> content) throws IOException {
        File file = new File(path);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            for (Object o : content) {
                writer.write(o.toString());
                writer.newLine();
            }
        }
    }
}
