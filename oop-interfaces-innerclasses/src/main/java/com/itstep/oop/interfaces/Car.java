package com.itstep.oop.interfaces;

public interface Car {

    int WHEELS_COUNT = 4;

    static int getDoorsCount(String carcase) {
        switch (carcase) {
            case "sedan":
                return 4;
            case "coupe":
                return 2;
            default:
                throw new RuntimeException("Carcase not supported");
        }
    }

    default void printStr(String str) {
        System.out.println(str);
    }

    String getCarCase();

    String getModel();

    int getMaxSpeed();
}
