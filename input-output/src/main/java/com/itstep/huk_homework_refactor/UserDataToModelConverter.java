package com.itstep.huk_homework_refactor;

import java.util.ArrayList;
import java.util.List;

public class UserDataToModelConverter implements DataToModelConverter<User> {


    @Override
    public List<User> convert(List<String> content) {
        //должны создавать нового юзера добавлять адреса и засовывать в коллекцию
        List<User> users = new ArrayList<>();
        String[] fields;
        for (String s : content) {
            fields = s.split(";"); //присвоили переменной значение, стрингу разделили по точке с запятой и получили массив строк данных юзера
            users.add(new User(fields[0], fields[1], fields[2]));//создали юзеров и добавили их в коллекцию
        }
        return users;
    }
}
