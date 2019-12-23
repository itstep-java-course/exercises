package com.itstep.collections.hashset;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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

    }

    private static class Car {
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
    }

}
