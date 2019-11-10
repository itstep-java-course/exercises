package com.itstep.cl.object.strahov_hometask;

public class Task2 {
    public static class Car {
        private String model;
        private String color;
        private int maksspeed;
        private String type;

        public Car(String model, String color, int maksspeed, String type) {
            this.model = model;
            this.color = color;
            this.maksspeed = maksspeed;
            this.type = type;
        }

        public String getCarInformation() {
            return "A car mode:" + model + ", its color:" + color + ", is max speed this auto:" + maksspeed + "km/h, and the type this auto:" + type;
        }
    }

    public static void main(String[] args) {
        Car Mercedes = new Car("Mercedes AMG C 63", "night-black", 240, "Sedan");
        Car Opel = new Car("Opel ASTRA SEDAN", "sea-blue", 190, "Sedan");
        Car Volkswagen = new Car ("Volkswagen T6 Multivan COMFORT Plus","Mojawe Beige",180, "Miniven");
        String carInfo = Mercedes.getCarInformation();
        String carInfo1 = Opel.getCarInformation();
        String carInfo2 = Volkswagen.getCarInformation();
        System.out.println(carInfo);
        System.out.println(carInfo1);
        System.out.println(carInfo2);
    }
}
