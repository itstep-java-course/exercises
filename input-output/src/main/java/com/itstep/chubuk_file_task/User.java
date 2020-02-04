package com.itstep.chubuk_file_task;

public class User {
    final String id;
    final String name;
    final String lastName;
    private Address address;

    public User(String id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public User(String id, String name, String lastName, Address address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
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
        if (address == null) {
            return id + "; " + name + "; " +
                    lastName;
        } else {
            return id + ";" + name + ";" +
                    lastName + ";" + address.getHouse()
                    + ";" + address.getStreet();
        }
    }
}
