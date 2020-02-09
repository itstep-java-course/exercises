package com.itstep.borovoy_homework;

import java.util.ArrayList;
import java.util.List;


public class UserDataToModelConverter implements DataToModelConverter<User> {
    public List<User> convert(List<String> list) {
        List<User> users = new ArrayList<>();
        String[] arr;
        for (String s : list) {
            arr = s.split(";");
            users.add(new User(arr[0], arr[1], arr[2]));
        }
        return users;
    }
}
