package com.itstep.cl.object.borovoy_homework;


public class Car {
    private String model;
    private String colour;
    private int age;
    private double mileage;
    private int price;

    private Car(String model, String colour, int age, double mileage, int price) {
        this.model = model;
        this.colour = colour;
        this.age = age;
        this.mileage = mileage;
        this.price = price;
    }

    private String getCarInfo() {
        return "The car model: " + model + " has color: " + colour + " is " + age + " years old " + " has : " + mileage + " millage " + " cost : " + price + "$";
    }

    public static void main(String[] args) {

        Car volvo = new Car("Volvo XC60", "red", 2, 58.782, 50000);
        Car opel = new Car("Kadett", "blue", 40, 527.114, 2000);
        Car bmw = new Car("x5", "black", 1, 22.327, 70000);
        Car tesla = new Car("model S", "white", 1, 11.128, 90000);

        String carInfo = volvo.getCarInfo();
        String carInfo1 = opel.getCarInfo();
        String carInfo2 = bmw.getCarInfo();
        String carInfo3 = tesla.getCarInfo();

        System.out.println(carInfo);
        System.out.println(carInfo1);
        System.out.println(carInfo2);
        System.out.println(carInfo3);
    }
}


