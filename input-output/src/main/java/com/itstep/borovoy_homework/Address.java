package com.itstep.borovoy_homework;

public class Address {
   private String userId;
   private String street;
   private String house;

     Address(String userId, String street, String house) {
        this.userId = userId;
        this.street = street;
        this.house = house;
    }

     String getUserId() {
        return userId;
    }

     String getStreet() {
        return street;
    }

     String getHouse() {
        return house;
    }

    @Override
    public String toString() {
        return userId + ";" + street + ";" + house + ";";
    }
}
