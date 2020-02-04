package com.itstep.perepeliatnyk_homework;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TestClass {

    private static final List<String> USER_NAMES = Arrays.asList( "1;Petr;Maksimov",
            "5;Ivan;Egorov",
            "2;Petr;Rakul",
            "3;Miha;Dobkin",
            "4;Danil;Maksimov");


    private static final List<String> USER_ADDRESSES = Arrays.asList( "1;Gagarina;25",
            "2;Pushkina;17",
            "4;Nauki;7",
            "5;Bajana;33",
            "3;Derjavinska;18");

    public static final String NAME_PATH = "input-output/src/main/java/com/itstep/perepeliatnyk_homework/myData/names.txt";
    public static final String ADDRESS_PATH = "input-output/src/main/java/com/itstep/perepeliatnyk_homework/myData/addresses.txt";
    public static final String PROFILE_PATH = "input-output/src/main/java/com/itstep/perepeliatnyk_homework/myData/profiles.txt";

    public static void main(String[] args) {
        FileCreator fileCreator = new FileCreator();
        FileReader fileReader = new FileReader();
        AgeAppender ageAppender = new AgeAppender();
        AddressDataToModelConverter addressDataToModelConverter = new AddressDataToModelConverter();
        UserAddressByIdGrouper userAddressByIdGrouper = new UserAddressByIdGrouper();
        UserDataToModelConverter userDataToModelConverter = new UserDataToModelConverter();

        try {
            fileCreator.createFile(NAME_PATH, USER_NAMES);
            fileCreator.createFile(ADDRESS_PATH, USER_ADDRESSES);
            List<String> usersStr = fileReader.fileReader(NAME_PATH);
            List<String> addressStr = fileReader.fileReader(ADDRESS_PATH);
            List<User> users = userDataToModelConverter.convert(usersStr);
            List<Address> address = addressDataToModelConverter.convert(addressStr);
            List<User> fullUsers = userAddressByIdGrouper.group(users, address);
            fileCreator.createFile(PROFILE_PATH, fullUsers);
            ageAppender.append(PROFILE_PATH);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

