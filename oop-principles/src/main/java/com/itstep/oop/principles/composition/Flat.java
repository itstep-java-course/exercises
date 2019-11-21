package com.itstep.oop.principles.composition;

public class Flat {
    private BathRoom bathRoom;
    private Room room;
    private Kitchen kitchen;

    public Flat(BathRoom bathRoom, Room room, Kitchen kitchen) {
        this.bathRoom = bathRoom;
        this.room = room;
        this.kitchen = kitchen;
    }
}
