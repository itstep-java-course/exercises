package com.itstep.cl.object.composition;

public class Test {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen(22.3, 12.5);
        BathRoom bathRoom = new BathRoom(12.4, 55);

        House house = new House(bathRoom, kitchen);

        System.out.println(house.getSquare());
    }
}
