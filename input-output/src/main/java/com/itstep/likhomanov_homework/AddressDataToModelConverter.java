package com.itstep.likhomanov_homework;

import java.util.ArrayList;
import java.util.List;

class AddressDataToModelConverter implements DataToModelConverter<Address> {

    @Override
    public List<Address> convert(List<String> data) {
        List<Address> addresses = new ArrayList<>();
        String[] fields;

        for (String onePiece : data) {
            fields = onePiece.split(";");
            addresses.add(new Address(fields[0], fields[1], fields[2]));
        }
        return addresses;
    }
}
