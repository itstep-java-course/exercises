package com.itstep.collections.hashset.likhomanov_homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CarCollectionGrader {

    public static Map<String, Set<Car>> group(Set<Car> stirredCars, Getable specificField) {

        Map<String, Set<Car>> groupedCars = new HashMap<>();

        for (Car car : stirredCars) {
            if (groupedCars.get(specificField.get(car)) == null) {
                Set<Car> set = new HashSet<>();
                set.add(car);
                groupedCars.put(specificField.get(car), set);
            } else {
                groupedCars.get(specificField.get(car)).add(car);
            }
        }
        return groupedCars;
    }
}
