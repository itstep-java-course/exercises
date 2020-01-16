package com.itstep.collections.shyrkov_collections_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {


        List<Car> cars = new ArrayList<>();
        cars.add(new Car(423423, "BMW", 2010, "Green", "Sedan"));
        cars.add(new Car(213321, "Audi", 2008, "Green", "Sedan"));
        cars.add(new Car(734734, "Mers", 2011, "Green", "Sedan"));
        cars.add(new Car(457377, "KIA", 2009, "Green", "Sedan"));
        cars.add(new Car(499999, "Schevrolet", 2012, "Green", "Sedan"));

        cars.sort(Car::compareTo);
        for (Car car : cars) {
            System.out.println(car);
        }

        Set<Table> tables = new TreeSet<>();
        tables.add(new Table(124.4));
        tables.add(new Table(213.4));
        tables.add(new Table(125));
        tables.add(new Table(10.5));

        for (Table table : tables) {
            System.out.println(table);
        }
    }
}
