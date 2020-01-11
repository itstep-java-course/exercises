package com.itstep;

import java.util.ArrayList;
import java.util.List;

public class RawTypesExample {
    public static void main(String[] args) {
        List rawList = new ArrayList();
        List<String> strList = new ArrayList<>();

        rawList = strList;

        //
        rawList.add(12);

        final String s = strList.get(0);

        // в рантайме компилятор удалит все дженерики и если посмотреть байт код то там будет что-то типа такого
        // final String s = (String) strList.get(0);
    }
}
