package com.itstep.oop.interfaces;

public interface SedanCar extends Car {

    default String getCarCase() {
        return "sedan";
    }
}
