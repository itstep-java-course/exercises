package com.itstep.strahov_homework;

public class User {
    String name;
    String id;
    String lastName;
    Address address;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }

    public User (String name, String id, String lastName, Address address) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.address=address;
    }

}
