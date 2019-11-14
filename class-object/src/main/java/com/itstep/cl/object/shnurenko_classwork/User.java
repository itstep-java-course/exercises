package com.itstep.cl.object.shnurenko_classwork;

import java.util.Objects;

public class User {

    private String name;
    private String lastName;
    private int age;

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public User(String name, String lastName) {
        this(name, lastName, 25);
    }

    public static User create25AgeUser(String name, String lastName) {
        return new User(name, lastName, 25);
    }

    public static void main(String[] args) {
//        User u = create25AgeUser("name", "last22");

        User user = new User("name1", "last", 25);
        User user1 = new User("name1", "last", 25);

        int i1 = user.hashCode();
        int i2 = user1.hashCode();

        System.out.println(i1);
        System.out.println(i2);


//        System.out.println(user.equals(user1));


//        String s = user.toString();
//
//        System.out.println(s);
//
        Object o = new Object();
//        o.toString();
//        o.equals(new Object());
//        int i = o.hashCode();
//        o.getClass()

//        System.out.println(i);




//





//        user.printUserInfo("name");
//        user.printUserInfo("name", 12);
//        user.printUserInfo("name", "last");
    }

    public void printUserInfo(String name) {
        System.out.println(name);
    }

    public void printUserInfo(double name) {
        System.out.println(name);
    }
    public void printUserInfo(int name) {
        System.out.println(name);
    }

    public void printUserInfo(String name, String lastName) {
        System.out.println(name);
        System.out.println(lastName);
    }

    public void printUserInfo(String name, int age) {
        System.out.println(age);
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age);
    }
}
