package com.itstep.borovoy_homework;


public class User {
    private String id;
    private String name;
    private String lastName;
    private Address address;

     User(String id, String name, String lastName, Address address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

     User(String id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

     String getId() {
        return id;
    }

     String getName() {
        return name;
    }

     String getLastName() {
        return lastName;
    }


    @Override
    public String toString() {
        return id + ";" + name + ";" + lastName + ";" + address.getStreet() + ";" + address.getHouse() + ";";
    }
}
