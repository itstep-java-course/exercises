package com.itstep.huk_homework;

public class PeopleInformation implements Comparable<PeopleInformation> {
    private Integer id;
    private String name;
    private String lastName;
    private String street;
    private String house;

    public PeopleInformation(Integer id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public PeopleInformation(String street, String house, Integer id) {
        this.id = id;
        this.street = street;
        this.house = house;
    }

    @Override
    public int compareTo(PeopleInformation o) {
        if (this.id.compareTo(o.id) == 0) {
            o.house = this.house;
            o.street = this.street;
            return 0;
        } else
            return this.id.compareTo(o.id);


    }

    @Override
    public String toString() {
        return "PeopleInformation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
}
