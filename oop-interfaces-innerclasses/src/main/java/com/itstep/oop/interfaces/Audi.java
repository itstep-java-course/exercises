package com.itstep.oop.interfaces;

public class Audi implements SedanCar {
    @Override
    public String getModel() {
        return "RS6";
    }

    @Override
    public int getMaxSpeed() {
        return 300;
    }
}
