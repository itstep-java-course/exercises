package com.itstep.oop.anonymous;

public abstract class Table {
    private final String square;

    protected Table(String square) {
        this.square = square;
    }

    public String getSquare() {
        return square;
    }

    public abstract String getColor();
}
