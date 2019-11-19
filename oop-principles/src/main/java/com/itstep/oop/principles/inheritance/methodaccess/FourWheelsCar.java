package com.itstep.oop.principles.inheritance.methodaccess;

public class FourWheelsCar extends Car {
    public FourWheelsCar(String color, String name) {
        super(color, name);
    }

    //можно расширять область видимости метода, но нельзя сужать
    @Override
    public String getCarInfo() {
        return super.getCarInfo();
    }
}
