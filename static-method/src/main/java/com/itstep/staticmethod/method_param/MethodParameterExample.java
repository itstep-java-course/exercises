package com.itstep.staticmethod.method_param;

public class MethodParameterExample {

    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BMW");

        int x = 12;

        MethodParameterExample parameterExample = new MethodParameterExample();
        parameterExample.changeModel(car);
        parameterExample.setOtherValue(x);

        System.out.println(car);
        System.out.println(x);
    }

    public void changeModel(Car car) {
        car.setModel("Mers");
    }

    public void setOtherValue(int x) {
        x = 6;
    }

}
