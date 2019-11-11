package com.itstep.cl.object.composition;

public class House {
    private BathRoom bathRoom;
    private Kitchen kitchen;

    public House(BathRoom bathRoom, Kitchen kitchen) {
        this.bathRoom = bathRoom;
        this.kitchen = kitchen;
    }

    public double getSquare() {
        return bathRoom.getLength() * bathRoom.getWidth() + kitchen.getLength() * kitchen.getWidth();
    }

}
