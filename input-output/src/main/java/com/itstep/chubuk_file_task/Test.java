package com.itstep.chubuk_file_task;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Test {

    private static final List<String> USER_NAMES = Arrays.asList(
            "1; Petr; Maksimov",
            "5; Ivan; Egorov",
            "2; Petr; Rakul",
            "3; Miha; Dobkin",
            "4; Danil; Maksimov");


    private static final List<String> USER_ADDRESSES = Arrays.asList(
            "1; Gagarina; 25",
            "2; Pushkina; 17",
            "4; Nauki; 7",
            "5; Bajana; 33",
            "3; Derjavinska; 18");

    String s = "ID; Name; Last name; Street; House; Years";

    public static void main(String[] args) {
        UserAddressByIdGrouper userAddressByIdGrouper = new UserAddressByIdGrouper();
        UserDataToModelConverter userDataToModelConverter = new UserDataToModelConverter();
        FileCreator fileCreator = new FileCreator();
        FileReader fileReader = new FileReader();
        AddressDataToModelConverter addressDataToModelConverter = new AddressDataToModelConverter();
        AgeAppender ageAppender = new AgeAppender();

        final File dir = new File("input-output/src/main/java/com.itstep/chubuk_file_task/TXT");
        dir.mkdirs();


        try {
            fileCreator.createFile("input-output/src/main/java/com.itstep/chubuk_file_task/TXT/text1.txt", USER_NAMES);
            fileCreator.createFile("input-output/src/main/java/com.itstep/chubuk_file_task/TXT/text2.txt", USER_ADDRESSES);
            List<User> users = userDataToModelConverter.covert(fileReader.readFile("input-output/src/main/java/com.itstep/chubuk_file_task/TXT/text1.txt"));
            List<Address> addresses = addressDataToModelConverter.covert(fileReader.readFile("input-output/src/main/java/com.itstep/chubuk_file_task/TXT/text2.txt"));

            List<User> userList = userAddressByIdGrouper.group(users, addresses);

            fileCreator.createFile("input-output/src/main/java/com.itstep/chubuk_file_task/TXT/text3.txt", userList);

            ageAppender.append("input-output/src/main/java/com.itstep/chubuk_file_task/TXT/text3.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
