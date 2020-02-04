package com.itstep.perepeliatnyk_homework;

import java.util.ArrayList;
import java.util.List;

public class UserAddressByIdGrouper {

    public List<User> group(List<User> users, List<Address> addresses){
        List<User> list = new ArrayList<>();
        for (User user : users) {
            for (Address address : addresses) {
                if (user.getId().equals(address.getId())){
                    list.add(new User(user.getId(), user.getName(), user.getLastName(), address));
                }

            }

        }
        return list;
    }

}
