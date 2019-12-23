package com.itstep.collections.hashset;

import java.util.*;

public class EqualsHashCodeOverrideExample {

    public static void main(String[] args) {
        Set<Car> correctOverriding = new HashSet<>();
        final Car car1 = new Car("1234", "X5", "red");
        correctOverriding.add(car1);

        car1.setVin("4567");

        System.out.println(correctOverriding.contains(car1));

//        correctOverriding.add(new Car("4567", "X5", "red"));

        for (Car car : correctOverriding) {
            System.out.println(car);
        }

//        compare to example
        Car c1 = new Car("2","X5", "red");
        Car c2 = new Car("2","X6", "green");

        System.out.println(c1.compareTo(c2));

        List<Car> cars = new ArrayList<>();
        cars.add(c2);
        cars.add(c1);

        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.vin.compareTo(o2.vin);
            }
        });

        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.model.compareTo(o2.model);
            }
        });
    }

    private static class Car implements Comparable<Car>{
        private String vin;
        private final String model;
        private String color;


        private Car(String vin, String model, String color) {
            this.vin = vin;
            this.model = model;
            this.color = color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setVin(String vin) {
            this.vin = vin;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "vin='" + vin + '\'' +
                    ", model='" + model + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Car car = (Car) o;
            return vin.equals(car.vin) && model.equals(car.model);
        }

        @Override
        public int hashCode() {
            return Objects.hash(vin, model);
        }

        @Override
        public int compareTo(Car o) {
            return this.model.compareTo(o.model);
        }
    }

}
