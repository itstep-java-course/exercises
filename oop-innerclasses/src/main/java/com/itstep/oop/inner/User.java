package com.itstep.oop.inner;

public class User {
    private final String name;
    private final int age;
    private final UserAddress userAddress;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.userAddress = new UserAddress();
    }

    public String getUserInfo() {
        return "The user name is: " + name + " and the age is: " + age + " " + userAddress.getUserAddress();
    }

    public class UserAddress {
//        private static int x = 5;
        private String street;
        private String home;

        public void setStreet(String street) {
            this.street = street;
        }

        public void setHome(String home) {
            this.home = home;
        }

        public String getUserAddress() {
            return "The address is: " + street + "/" + home;
        }
    }
}
