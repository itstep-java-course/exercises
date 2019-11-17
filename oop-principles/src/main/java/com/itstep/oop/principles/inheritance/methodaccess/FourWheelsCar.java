package com.itstep.oop.principles.inheritance.methodaccess;

public class FourWheelsCar extends Car {
    public FourWheelsCar(String color, String name) {
        super(color, name);
    }

    @Override
    public String getCarInfo() {
        return super.getCarInfo();
    }
}
