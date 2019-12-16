package com.itstep.oop.anonymous.huk_homework;

//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.Date;

public class Car implements AbleToRide {

    public class Wheel{ //nested class
        private double wheelRadius;
        private String wheelColor;



        public Wheel(double wheelRadius, String wheelColor) {
            this.wheelRadius = wheelRadius;
            this.wheelColor = wheelColor;
        }

        public void spin(){
            System.out.println("A wheel is spinning...");//колесо крутится
        }
    }

    private String carModel;
    private String carBodeType;
    private String carColor;
    private int carNumberOfSeats;
    private double carPrice;
    private double carMaxSpeed;
    private Date carDate;

    private Wheel[] wheels = new Wheel[4];




    public Wheel[] getWheels() {
        return wheels;
    }

    public Car(String carModel, String carBodeType, String carColor, int carNumberOfSeats, double carPrice, double carMaxSpeed, Date carDate) {
        this.carModel = carModel;
        this.carBodeType = carBodeType;
        this.carColor = carColor;
        this.carNumberOfSeats = carNumberOfSeats;
        this.carPrice = carPrice;
        this.carMaxSpeed = carMaxSpeed;
        this.carDate = carDate;

        for (int i = 0; i < 4; i++) {
            this.wheels[i] = new Wheel(25,"Black");
        }
    }

    @Override
    public void ride() {
        class Engine{ //inner class
            private String engineVolume;
            private String engineBrand;

            public Engine(String engineVolume, String engineBrand) {
                this.engineVolume = engineVolume;
                this.engineBrand = engineBrand;
            }

            public void start(){
                System.out.println("Engine started...");
            }
        }
        Engine engine = new Engine("120cc","Ferrari");
        engine.start();

        for (int i = 0; i <wheels.length ; i++) {
            wheels[i].spin();
        }
        System.out.println("Car is driving...");
    }

//    public static Date StringToDate(String s) {
//
//        Date result = null;
//        try {
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            result = dateFormat.parse(s);
//        } catch (ParseException e) {
//            e.printStackTrace();
//
//        }
//        return result;
//    }

    public String getCarInfo() {
        return "The car model: " + carModel + " Body type: " + carBodeType + " Color: " + carColor + " Number of seats: " + carNumberOfSeats + " Price: " + carPrice + " Max speed: " + carMaxSpeed + " Date: "+ carDate;
    }

}




