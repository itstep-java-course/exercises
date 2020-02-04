package com.itstep.perepeliatnyk_homework;

import java.util.ArrayList;
import java.util.List;

public class AddressDataToModelConverter implements DataToModelConverter<Address> {

    @Override
    public List<Address> convert(List<String> data) {
        List<Address> addressList = new ArrayList<>();
        String[] strings;
        for (String line : data) {
            strings = line.split(";");
            addressList.add(new Address(strings[0], strings[1], strings[2]));

        }
        return addressList;
    }
}
