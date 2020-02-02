package com.itstep.huk_homework_refactor;

import java.util.ArrayList;
import java.util.List;

public class AddressDataToModelConverter implements DataToModelConverter<Address> {



    @Override
    public List<Address> convert(List<String> content) {

            List<Address> addresses = new ArrayList<>();
            String[] fields;
            for (String s : content) {
                fields = s.split(";"); //присвоили переменной значение, стрингу разделили по точке с запятой и получили массив строк данных адресов
                addresses.add(new Address(fields[0], fields[1], fields[2]));// создали адреса и добавили их в коллекцию
            }
            return addresses;
        }
    }



