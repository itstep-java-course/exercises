package com.itstep.likhomanov_homework;

class Address {

    private final String id;
    private final String street;
    private final String house;

    Address(String id, String street, String house) {
        this.id = id;
        this.street = street;
        this.house = house;
    }

    String getId() {
        return id;
    }

    String getStreet() {
        return street;
    }

    String getHouse() {
        return house;
    }
}
