package com.itstep.cl.object.perepeliatnyk_homework;

//  C помощью класса его полей и методов описать сущность АВТОМОБИЛЬ

public class CarTask {
    private String name;
    private String model;
    private String body;
    private int year;
    private double motor;
    private String transmission;

    public CarTask(String name, String model, String body, int year, double motor, String transmission) {
        this.name = name;
        this.model = model;
        this.body = body;
        this.year = year;
        this.motor = motor;
        this.transmission = transmission;

//        public CarTask(){
//            this.name = "Opel";
//            this.model = "Calibra";
//            this.body = "Coupe";
//            this.year = "1991";
//            this.motor = "2.0 petrol";
//            this.transmission = "Manual (6)";
//        }
    }
    public String allCarInfo() {return " Auto name: " + name + "; model: " + model + "; body type: " + body +
            "; year: " + year + "; motor size: " + motor + "; transmission: " + transmission; }

    public static void main(String[] args) {
//    CarTask Opel = new CarTask();

        CarTask Mercedes = new CarTask("Mercedes", "S220", "Sedan", 2018, 4.4, "Automatic (6)");
        CarTask Volkswagen = new CarTask("Volkswagen", "Transporter", "Wagon", 2008, 2.0, "Manual (5)");
        CarTask Opel = new CarTask("Opel", "Calibra", "Coupe", 1991, 2.0, "Manual (6)");
        CarTask Renault = new CarTask("Renault", "Megane", "Universal", 2015, 1.5, "Robot (4)");


        String carInfo = Mercedes.allCarInfo();
        String carInfo1 = Volkswagen.allCarInfo();
        String carInfo2 = Opel.allCarInfo();
        String carInfo3 = Renault.allCarInfo();


        System.out.println(carInfo);
        System.out.println(carInfo1);
        System.out.println(carInfo2);
        System.out.println(carInfo3);


    }
}
