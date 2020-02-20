package com.itstep.safankov_homework;

import java.util.ArrayList;
import java.util.List;

public class UserDataToModelConverter implements DataToModelConverter<User> {
    @Override
    public List<User> covert(List<String> data) {
        List<User> users = new ArrayList<>();
        String[] line;
        for (String s : data) {
            line = s.split(";");
            users.add(new User(line[0], line[1], line[2]));
        }
        return users;
    }

}
