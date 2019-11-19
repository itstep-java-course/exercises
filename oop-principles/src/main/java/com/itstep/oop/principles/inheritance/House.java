package com.itstep.oop.principles.inheritance;

class House {

    private final Room[] rooms;

    House(Room[] rooms) {
        this.rooms = rooms;
    }

    double getSquare() {
        double square = 0.0;

        for (Room room : rooms) {
            square += room.getPayableSquare();
        }
        return square;
    }
}
