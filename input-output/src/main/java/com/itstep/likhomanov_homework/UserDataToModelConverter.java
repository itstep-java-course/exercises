package com.itstep.likhomanov_homework;

import java.util.ArrayList;
import java.util.List;

class UserDataToModelConverter implements DataToModelConverter<User> {

    @Override
    public List<User> convert(List<String> data) {
        List<User> users = new ArrayList<>();
        String[] fields;

        for (String onePiece : data) {
            fields = onePiece.split(";");
            users.add(new User(fields[0], fields[1], fields[2]));
        }
        return users;
    }
}
