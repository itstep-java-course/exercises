package com.itstep.collections.hashset.likhomanov_homework;

public enum Colour {
    WHITE("White"),
    SILVER("Silver"),
    RED("Red"),
    BLACK("Black"),
    BLUE("Blue"),
    GRAY("Gray"),
    ORANGE("Orange"),
    GREEN("Green");

    private final String colour;

    Colour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return colour;
    }
}
