package com.itstep.huk_homework_refactor;

import java.util.ArrayList;
import java.util.List;

public class UserAddressByIdGrouper {
    public List<User> group(List<Address> addresses, List<User> users) {
        //он получает колецкцию адресов и колеккцию юзеров
        List<User> users1 = new ArrayList<>();
        for (User user : users) {
            for (Address address : addresses) {
                if(user.getId().equals(address.getUserId())){
                    users1.add(new User(user.getId(), user.getName(),user.getLastName(), address));//создаем нового копируем старые данные юзера + добавляем адресс
                }
            }
        }
        return  users1;
    }
}
