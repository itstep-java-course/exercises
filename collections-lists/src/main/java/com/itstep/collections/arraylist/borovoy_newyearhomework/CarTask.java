package com.itstep.collections.arraylist.borovoy_newyearhomework;

import java.util.ArrayList;
import java.util.List;

class CarTask {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("1234", "Duster", "2011", "white", "SUV"));
        cars.add(new Car("1245", "CLS250", "2014", "brown", "Sedan"));
        cars.add(new Car("1275", "Megane", "2013", "green", "Coupe"));
        cars.add(new Car("1211", "X5", "2019", "black", "SUV"));
        cars.add(new Car("1257", "A4", "2013", "white", "Sedan"));
        cars.add(new Car("1278", "Mustang", "2015", "red", "Coupe"));
        cars.add(new Car("1241", "Corolla", "2018", "black", "Sedan"));
        cars.add(new Car("1268", "Tucson", "2016", "silver", "SUV"));
        cars.add(new Car("1273", "S63", "2015", "grey", "Coupe"));
        cars.add(new Car("1249", "CC", "2011", "white", "Coupe"));
        cars.add(new Car("1253", "Rav4", "2017", "black", "SUV"));
        cars.add(new Car("1222", "Is250", "2007", "blue", "Sedan"));


        cars.sort(Car::compareTo);
        for (int i = 0; i < cars.size(); i++)
            System.out.println(cars.get(i));

    }


    private static class Car implements Comparable<Car> {
        private String vin;
        private final String model;
        private String year;
        private String colour;
        private String type;

        private Car(String vin, String model, String year, String colour, String type) {
            this.vin = vin;
            this.model = model;
            this.year = year;
            this.colour = colour;
            this.type = type;
        }

        public String getVin() {
            return vin;
        }

        public String getModel() {
            return model;
        }

        public String getYear() {
            return year;
        }

        public String getColour() {
            return colour;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "vin='" + vin + '\'' +
                    ", model='" + model + '\'' +
                    ", year='" + year + '\'' +
                    ", colour='" + colour + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Car o) {
            return this.colour.compareTo(o.colour);
        }
    }

}

