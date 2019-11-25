package com.itstep.oop.interfaces;

public class BMW implements SedanCar {
    @Override
    public String getModel() {
        return "M250";
    }

    @Override
    public int getMaxSpeed() {
        return 250;
    }
}
