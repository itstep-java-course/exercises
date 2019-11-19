package com.itstep.oop.principles.inheritance;

public class Builder {
    public static void main(String[] args) {
        Room kitchen = new Kitchen(12.0, 6.7);
        Room bathRoom = new BathRoom(3.0, 2.2);
        Room balcony = new Balcony(2.0, 1.2, 3.0);

        Room[] rooms = new Room[]{kitchen, bathRoom, balcony};

        House house = new House(rooms);

        double square = house.getSquare();
        System.out.println("The payable square of the building is: " + square);

        Balcony balconyWithVolume = new Balcony(2.0, 1.2, 3.0);

        System.out.println(balconyWithVolume.getPayableSquare());
        System.out.println(balconyWithVolume.getVolume());
    }
}
