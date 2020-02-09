package com.itstep.borovoy_homework;

import java.io.*;
import java.util.Arrays;
import java.util.List;

 class FileWriter {
    private static final String test1 = "input-output/src/main/java/com/itstep/borovoy_homework/myData/test1.txt";
    private static final String test2 = "input-output/src/main/java/com/itstep/borovoy_homework/myData/test2.txt";
    private static final String test3 = "input-output/src/main/java/com/itstep/borovoy_homework/myData/test3.txt";
    private static final List<String> USER_NAMES = Arrays.asList("1;Petr;Maksimov",
            "5;Ivan;Egorov",
            "2;Petr;Rakul",
            "3;Miha;Dobkin",
            "4;Danil;Maksimov");


    private static final List<String> USER_ADDRESSES = Arrays.asList("1;Gagarina;25",
            "2;Pushkina;17",
            "4;Nauki;7",
            "5;Bajana;33",
            "3;Derjavinska;18");

     void write() {
        FileCreator fileCreator = new FileCreator();
        AgeAppender ageAppender = new AgeAppender();
        FileReader fileReader = new FileReader();
        UserDataToModelConverter userDataToModelConverter = new UserDataToModelConverter();
        AddressDataToModelConverter addressDataToModelConverter = new AddressDataToModelConverter();
        UserAddressByIdGrouper userAddressByIdGrouper = new UserAddressByIdGrouper();
        try {
            fileCreator.createFile(test1, USER_NAMES);
            fileCreator.createFile(test2, USER_ADDRESSES);
            List<String> usersStr = fileReader.readFile(test1);
            List<String> addressStr = fileReader.readFile(test2);
            List<User> users = userDataToModelConverter.convert(usersStr);
            List<Address> addresses = addressDataToModelConverter.convert(addressStr);
            List<User> fullUsersInformation = userAddressByIdGrouper.group(addresses, users);
            fileCreator.createFile(test3, fullUsersInformation);
            ageAppender.append(test3);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
