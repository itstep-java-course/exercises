package com.itstep.cl.object.chubuk_homework;

public class Car
{
    private String model;
    private String color;
    private int year;
    private String driveUnit;
    private double fuelConsumption;
    private int price;

    public Car(String model, String color, int year, String driveUnit, double fuelConsumption, int price)
    {
        this.model = model;
        this.color = color;
        this.year = year;
        this.driveUnit = driveUnit;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
    }
    public String getCarsInfo()
    {
        return "The car model: " + model + " car price (uah) is: " + price + " has color: "
                + color + " year of issue: " + year + " drive unit: "
                + driveUnit + " has flue consumption per 100 kilometers: " + fuelConsumption;
    }

    public static void main(String[] args)
    {
        Car volvo = new Car("Volvo V60 Cross Country", "Ice White",
                2020, "full", 6.7, 1341862);
        Car opel = new Car("OPEL CROSSLAND X", " White with black",
                2017, "FWD",6.4,510500);

        String carInfo = volvo.getCarsInfo();
        String carInfo2 = opel.getCarsInfo();

        System.out.println(carInfo);
        System.out.println(carInfo2);
    }
}
