package com.itstep.collections.arraylist.borovoy_newyearhomework;

import java.util.*;

class CarTask {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("1234", "Duster", "2011", "white", BodyType.SUV));
        cars.add(new Car("1245", "CLS250", "2014", "brown", BodyType.SEDAN));
        cars.add(new Car("1275", "Megane", "2013", "green", BodyType.COUPE));
        cars.add(new Car("1211", "X5", "2019", "black", BodyType.SUV));
        cars.add(new Car("1257", "A4", "2013", "white", BodyType.SEDAN));
        cars.add(new Car("1278", "Mustang", "2015", "red", BodyType.COUPE));
        cars.add(new Car("1241", "Corolla", "2018", "black", BodyType.SEDAN));
        cars.add(new Car("1268", "Tucson", "2016", "silver", BodyType.SUV));
        cars.add(new Car("1273", "S63", "2015", "grey", BodyType.COUPE));
        cars.add(new Car("1249", "CC", "2011", "white", BodyType.COUPE));
        cars.add(new Car("1253", "Rav4", "2017", "black", BodyType.SUV));
        cars.add(new Car("1222", "Is250", "2007", "blue", BodyType.SEDAN));


        cars.sort(Car::compareTo);
        for (int i = 0; i < cars.size(); i++)
            System.out.println(cars.get(i));

    }

    enum BodyType {
        SUV("Suv"),
        COUPE("Coupe"),
        SEDAN("Sedan");
        private String type;


        BodyType(String type) {
            this.type = type;
        }

        public static BodyType getTypeByTypeName(String name) {
            final BodyType[] carType = values();

            for (BodyType value : carType) {
                if (value.type.equals(name)) {
                    return value;
                }
            }
            throw new RuntimeException("Illegal type: " + name);
        }

        @Override
        public String toString() {
            return type;
        }
    }


    private static class Car implements Comparable<Car> {
        private String vin;
        private final String model;
        private String year;
        private String colour;
        private final BodyType type;

        private Car(String vin, String model, String year, String colour, BodyType type) {
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

        public BodyType getType() {
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