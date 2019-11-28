package com.itstep.oop.interfaces;

public class Mercedes implements SedanCar {
    @Override
    public String getModel() {
        return "S 500";
    }

    @Override
    public int getMaxSpeed() {
        return 220;
    }
}
