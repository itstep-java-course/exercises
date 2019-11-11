package com.itstep.cl.object.shilov_homework;

        class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getCarInfo() {
        return "The car model: " + model + " has color: " + color;
    }

    public static void main(String[] args) {
//        Car vaz = new Car();
        Car Ford = new Car("Focus", "black");
        Car Chevrolet = new Car("Camaro", "red");
        Car BMW = new Car("760", "blue");

        String carInfo = Ford.getCarInfo();
        String carInfo1 = Chevrolet.getCarInfo();
        String carInfo2 = BMW.getCarInfo();

        System.out.println(carInfo);
        System.out.println(carInfo1);
        System.out.println(carInfo2);
    }
}