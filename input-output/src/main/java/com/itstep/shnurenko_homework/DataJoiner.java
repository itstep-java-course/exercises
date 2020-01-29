package com.itstep.shnurenko_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataJoiner {

    private final Map<Integer, User> usersMap;
    private final Map<Integer, UserAddress> addresses;

    public DataJoiner(Map<Integer, User> usersMap,
                      Map<Integer, UserAddress> addresses) {
        this.usersMap = usersMap;
        this.addresses = addresses;
    }

    List<User> joinUserAndAddressById() {
        List<User> users = new ArrayList<>();
        for (Map.Entry<Integer, User> userEntry : usersMap.entrySet()) {
            final Integer userId = userEntry.getKey();
            final User user = userEntry.getValue();

            final UserAddress userAddress = addresses.get(userId);
            if (userAddress == null) {
                continue;
            }
            user.setAddress(userAddress);

            users.add(user);
        }
        return users;
    }
}
