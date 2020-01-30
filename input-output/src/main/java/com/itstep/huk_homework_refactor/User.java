package com.itstep.huk_homework_refactor;

public class User {
    String id;
    String name;
    String lastName;
    Address address;

    public User(String id, String name, String lastName, Address address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return id + ";" + name + ";" + lastName + ";" + address + ";";
    }
}

