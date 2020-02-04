package com.itstep.perepeliatnyk_homework;

public class User {
    private final String id;
    private final String name;
    private final String lastName;
    private final Address address;

    public User(String id, String name, String lastName, Address address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }
    public User(String id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = null;
    }



    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        if (address == null) return id + ";" + name + ";" + lastName + ";";
        else return id + ";" + name + ";" + lastName + ";" + address.getStreet() + ";" + address.getHouse() + ";";
    }
}
