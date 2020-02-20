package com.itstep.safankov_homework;

import java.util.ArrayList;
import java.util.List;

public class AddressDataToModelConverter implements DataToModelConverter<Address> {

    @Override
    public List<Address> covert(List<String> data) {
        List<Address> addresses = new ArrayList<>();
        String[] line;
        for (String s : data) {
            line = s.split(";");
            addresses.add(new Address(line[0], line[1], line[2]));
        }
        return addresses;
    }
}
