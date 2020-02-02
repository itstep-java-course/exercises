package com.itstep.likhomanov_homework;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class WorkingWithFilesTest {

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

    private static final String NAMES_PATH = "input-output/src/main/java/com/itstep/likhomanov_homework/data/names.txt";
    private static final String ADDRESSES_PATH = "input-output/src/main/java/com/itstep/likhomanov_homework/data/addresses.txt";
    private static final String PROFILES_PATH = "input-output/src/main/java/com/itstep/likhomanov_homework/data/userProfiles.txt";

    public static void main(String[] args) {
        FileCreator fileCreator = new FileCreator();
        FileReader fileReader = new FileReader();
        UserDataToModelConverter userConverter = new UserDataToModelConverter();
        AddressDataToModelConverter addressConverter = new AddressDataToModelConverter();
        UserAndAddressByIdGrouper idGrouper = new UserAndAddressByIdGrouper();
        FileModifier fileModifier = new FileModifier();

        try {

            fileCreator.createFile(NAMES_PATH, USER_NAMES);
            fileCreator.createFile(ADDRESSES_PATH, USER_ADDRESSES);

            List<User> users = userConverter.convert(fileReader.readFile(NAMES_PATH));
            List<Address> addresses = addressConverter.convert(fileReader.readFile(ADDRESSES_PATH));

            List<User> extendedUsers = idGrouper.group(users, addresses);

            fileCreator.createFile(PROFILES_PATH, extendedUsers);

            fileModifier.modify(PROFILES_PATH, lines -> lines.stream()
                                                            .sorted()
                                                            .collect(Collectors.toList()));

            fileModifier.modify(PROFILES_PATH, lines -> lines.stream()
                                                            .map(line -> line + new Random().nextInt(100))
                                                            .collect(Collectors.toList()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
