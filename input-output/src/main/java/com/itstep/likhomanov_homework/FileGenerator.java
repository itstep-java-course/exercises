package com.itstep.likhomanov_homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class FileGenerator implements FileHandler {

    private static final List<String> USER_NAMES = Arrays.asList(   "1;Petr;Maksimov",
                                                                    "5;Ivan;Egorov",
                                                                    "2;Petr;Rakul",
                                                                    "3;Miha;Dobkin",
                                                                    "4;Danil;Maksimov");


    private static final List<String> USER_ADDRESSES = Arrays.asList(   "1;Gagarina;25",
                                                                        "2;Pushkina;17",
                                                                        "4;Nauki;7",
                                                                        "5;Bajana;33",
                                                                        "3;Derjavinska;18");

    void createFileWithNames() {
        writeFile(NAMES_PATH, NAMES_HEADER, USER_NAMES);
    }

    void createFileWithAddresses() {
        writeFile(ADDRESSES_PATH, ADDRESSES_HEADER, USER_ADDRESSES);
    }

    void createFileWithUserProfiles(List<?> users) {
        writeFile(PROFILES_PATH, PROFILE_HEADER, users);
    }

    @Override
    public boolean writeFile(String path, String header, List<?> data) {
        File file = new File(path);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            writer.write(header);
            writer.newLine();
            for (Object user : data) {
                writer.write(user.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
