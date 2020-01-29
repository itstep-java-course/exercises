package com.itstep.shnurenko_homework;

import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        UserDataModelProvider usersProvider = new UserDataModelProvider();
        UserAddressDataModelProvider userAddressesProvider = new UserAddressDataModelProvider();

//        todo
        final Map<Integer, User> users = usersProvider.getDataModel("path_to_users_file");
//        todo
        final Map<Integer, UserAddress> addresses = userAddressesProvider.getDataModel("path_to_addresses_file");

        final List<User> joinedData = new DataJoiner(users, addresses).joinUserAndAddressById();

//        todo
        final ContentWriter contentWriter = new ContentWriter("pathToResultFile");

        contentWriter.writeGeneralInfo(joinedData);
        contentWriter.appendUsersAge(joinedData);
    }
}
