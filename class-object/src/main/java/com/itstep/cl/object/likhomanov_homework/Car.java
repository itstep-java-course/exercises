package com.itstep.cl.object.likhomanov_homework;

public class Car {
    private String brand;
    private String model;
    private String productionYear;
    private String colour;
    private String condition;

    public Car () {
        brand = "VAZ";
        model = "2101";
        productionYear = "1979";
        colour = "Rotten cherry";
        condition = "Worn out";
    }

    public Car (String brand, String model, String productionYear, String colour, String condition) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.colour = colour;
        this.condition = condition;
    }

    public void setBrandAndModel(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCarInfo() {
        return brand + ", " + model + ", " + productionYear + ", " + colour + ", " + condition;
    }
}
