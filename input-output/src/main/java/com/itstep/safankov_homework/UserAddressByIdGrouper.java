package com.itstep.safankov_homework;

import java.util.List;
import java.util.ArrayList;
public class UserAddressByIdGrouper {
    public List<User> group(List<User> userList, List<Address> addressList){
        List<User> users = new ArrayList<>();
        for (User u : userList) {
            for (Address address : addressList) {
                if(u.getId().equals(address.getUserId())){
                    users.add(new User(u.getId(), u.getName(),u.getLastName(), address));
                }
            }
        }
        return  users;
    }
}
