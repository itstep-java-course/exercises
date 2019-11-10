package com.itstep.cl.object.kukishev_homework;

public class Car {

    private String mark;
    private String model;
    private String type;
    private String engine;

    public Car (String mark, String model, String type, String engine){
        this.mark = mark;
        this.model = model;
        this.type = type;
        this.engine = engine;

    }

    public String getCarInfo() {
        return "this is" + type + mark + model + "has powerfull" + engine;
    }

    public static void main(String[] args) {

        Car mazda = new Car (mark: "Mazda", model: "6", type: "sedan", engine: "2.5T");
        Car suzuki = new Car (mark: "Suzuki", model: "SX4", type: "SUV", engine: "1.4T");

        String carInfo = mazda.getCarInfo();
        String carInfo1 = suzuki.getCarInfo();

        System.out.println(carInfo);
        System.out.println(carInfo1);

    }





}
