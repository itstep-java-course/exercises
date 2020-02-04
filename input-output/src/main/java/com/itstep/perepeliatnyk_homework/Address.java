package com.itstep.perepeliatnyk_homework;

public class Address {
    private final String id;
    private final String street;
    private final String house;

    public String getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public Address(String id, String street, String house) {
        this.id = id;
        this.street = street;
        this.house = house;
    }
}
