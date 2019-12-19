package com.itstep.collections.hashset;

import java.util.*;

public class SortedSetTest {
    public static void main(String[] args) {
        SortedSet<Car> sortedSet = new TreeSet<>();

        sortedSet.add(new Car("ab"));
        sortedSet.add(new Car("ad"));
        sortedSet.add(new Car("az"));
        sortedSet.add(new Car("af"));

        for (Car s : sortedSet) {
            System.out.println(s.model);
        }

        Comparable<String> comparable = new Comparable<String>() {
            @Override
            public int compareTo(String o) {
                return 0;
            }
        };

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };

        List<NotComparableCar> cars = new ArrayList<>();
        cars.add(new NotComparableCar("ab"));
        cars.add(new NotComparableCar("ad"));
        cars.add(new NotComparableCar("az"));
        cars.add(new NotComparableCar("af"));

        System.out.println(" =============== not sorted list ==========");
        for (NotComparableCar car : cars) {
            System.out.println(car.model);
        }

        cars.sort(new Comparator<NotComparableCar>() {
            @Override
            public int compare(NotComparableCar o1, NotComparableCar o2) {
                return o1.model.compareTo(o2.model);
            }
        });

        System.out.println(" =============== sorted list ==========");
        for (NotComparableCar car : cars) {
            System.out.println(car.model);
        }
    }

    private static class NotComparableCar {
        private final String model;

        private NotComparableCar(String model) {
            this.model = model;
        }
    }

    private static class Car implements Comparable<Car> {
        private final String model;

        private Car(String model) {
            this.model = model;
        }

        @Override
        public int compareTo(Car o) {
            return this.model.compareTo(o.model);
        }
    }
}
