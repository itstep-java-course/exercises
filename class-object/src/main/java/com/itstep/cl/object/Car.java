package com.itstep.cl.object;

public class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

//    public Car() {
//        this.model = "VAZ";
//        this.color = "yellow";
//    }

    public String getCarInfo() {
        return "The car model: " + model + " has color: " + color;
    }

    public static void main(String[] args) {
//        Car vaz = new Car();
        Car volvo = new Car("Volvo XC60", "red");
        Car opel = new Car("Cadet", "blue");
        Car bmw = new Car("BMW", "green");

        String carInfo = volvo.getCarInfo();
        String carInfo1 = opel.getCarInfo();
        String carInfo2 = bmw.getCarInfo();

        System.out.println(carInfo);
        System.out.println(carInfo1);
        System.out.println(carInfo2);
    }
}
