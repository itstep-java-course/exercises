package com.itstep.borovoy_homework;

import java.util.ArrayList;
import java.util.List;

public class AddressDataToModelConverter implements DataToModelConverter<Address> {


    public List<Address> convert(List<String> list) {

        List<Address> addresses = new ArrayList<>();
        String[] arr;
        for (String s : list) {
            arr = s.split(";");
            addresses.add(new Address(arr[0], arr[1], arr[2]));
        }
        return addresses;
    }
}


