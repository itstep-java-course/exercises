package com.itstep.borovoy_homework;

import java.util.ArrayList;
import java.util.List;

 class UserAddressByIdGrouper {
     List<User> group(List<Address> addresses, List<User> users) {
        List<User> list = new ArrayList<>();
        for (User user : users) {
            for (Address address : addresses) {
                if (user.getId().equals(address.getUserId())) {
                    list.add(new User(user.getId(), user.getName(), user.getLastName(), address));
                }
            }
        }
        return list;
    }
}

