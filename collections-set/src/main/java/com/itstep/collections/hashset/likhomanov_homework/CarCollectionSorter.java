package com.itstep.collections.hashset.likhomanov_homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CarCollectionSorter {

    public static Map<String, Set<Car>> sort(Set<Car> stirredCars, Getable function) {

        Map<String, Set<Car>> sortedCars = new HashMap<>();

        for (Car car : stirredCars) {
            if (sortedCars.get(function.get(car)) == null) {
                Set<Car> set = new HashSet<>();
                set.add(car);
                sortedCars.put(function.get(car), set);
            } else {
                sortedCars.get(function.get(car)).add(car);
            }
        }
        return sortedCars;
    }
}
