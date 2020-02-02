package com.itstep.likhomanov_homework;

import java.util.ArrayList;
import java.util.List;

class UserAndAddressByIdGrouper {

    List<User> group(List<User> users, List<Address> addresses) {
        List<User> extendedUsers = new ArrayList<>();

        for (User user : users) {

            for (Address address : addresses) {

                if (user.getId().equals(address.getId())) {
                    extendedUsers.add(new User(user.getId(), user.getName(), user.getLastName(), address));
                }
            }
        }
        return extendedUsers;
    }
}
