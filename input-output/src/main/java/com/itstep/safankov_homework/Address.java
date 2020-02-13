package com.itstep.safankov_homework;


    public class Address {
        final String userId;
        final String street;
        final String house;

        public String getUserId() {
            return userId;
        }

        public String getStreet() {
            return street;
        }

        public String getHouse() {
            return house;
        }

        public Address(String userId, String street, String house) {
            this.userId = userId;
            this.street = street;
            this.house = house;
        }
        @Override
        public String toString() {
            return "Address{" +
                    "userId='" + userId + '\'' +
                    ", street='" + street + '\'' +
                    ", house='" + house + '\'' +
                    '}';
        }
    }

