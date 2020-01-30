package com.itstep.strahov_homework;

public class Address  {
 String userId;
 String street;
 String house;

    public Address(String userId, String street, String house) {
        this.userId = userId;
        this.street = street;
        this.house = house;
    }

    @Override
    public String toString() {
        return userId + ';' +  street + ';' +  house + ';' ;
    }
}
