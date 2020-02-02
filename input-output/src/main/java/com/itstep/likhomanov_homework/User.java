package com.itstep.likhomanov_homework;

class User {

    private final String id;
    private final String name;
    private final String lastName;
    private final Address address;

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
        this.address = null;
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
        if (address == null) return id + ";" + name + ";" + lastName + ";";
        else return id + ";" + name + ";" + lastName + ";" + address.getStreet() + ";" + address.getHouse() + ";";
    }
}
