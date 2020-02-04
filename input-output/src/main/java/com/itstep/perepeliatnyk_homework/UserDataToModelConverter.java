package com.itstep.perepeliatnyk_homework;

import java.util.ArrayList;
import java.util.List;

public class UserDataToModelConverter implements DataToModelConverter <User> {

    @Override
    public List<User> convert(List<String> data) {
        List<User> userList = new ArrayList<>();
        String[] strings;
        for (String line : data) {
            strings = line.split(";");
            userList.add(new User(strings[0], strings[1], strings[2]));

        }
        return userList;
    }
}
