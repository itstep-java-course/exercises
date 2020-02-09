package com.itstep.huk_homework_refactor;

public class Address {
    private String userId;
    private String street;
    private String house;

    public Address(String userId, String street, String house) {
        this.userId = userId;
        this.street = street;
        this.house = house;
    }

    public String getUserId() {
        return userId;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    @Override
    public String toString() {
        return userId + ";" + street + ";" + house + ";";
    }
}
