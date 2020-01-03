package com.itstep.collections.hashset.likhomanov_homework.map_of_cars;

import com.itstep.collections.hashset.likhomanov_homework.Cars;

import java.util.*;

class CarSortingTest {

    public static void main(String[] args) {
        CarSortingTest test = new CarSortingTest();

        final Set<Cars> cars = test.getSetOfCars();

        Map<String, Set<Cars>> sortedCars = new HashMap<>();

        sortedCars.put("2019", test.sortBy(cars, "2019"));
        sortedCars.put("Red", test.sortBy(cars, "Red"));
        sortedCars.put("Sedan", test.sortBy(cars, "Sedan"));

        test.print(sortedCars);
    }

    private Set<Cars> getSetOfCars() {
        Set<Cars> cars = new HashSet<>();
        Collections.addAll(cars, Cars.values());
        return cars;
    }

    private Set<Cars> sortBy(Set<Cars> what, String param) {
        Set<Cars> sortedCars = new HashSet<>();

        for (Cars car : what) {
            if (car.findMatch(param))
                sortedCars.add(car);
        }

        return sortedCars;
    }

    private void print(Map<String, Set<Cars>> cars) {

        for (Map.Entry<String, Set<Cars>> entry : cars.entrySet()) {
            String s = entry.getKey() + " → " + getStringOfValue(entry.getKey(), entry.getValue());
            System.out.println(s);
        }
    }

    private String getStringOfValue(String key, Set<Cars> value) {
        StringBuilder s = new StringBuilder();
        int lastSemicolon;

        for (Cars car : value) {
            s.append(checkForSuitability(key, car.getVin()))
                    .append(checkForSuitability(key, car.getModel()))
                    .append(checkForSuitability(key, car.getColour()))
                    .append(checkForSuitability(key, car.getYear()))
                    .append(checkForSuitability(key, car.getType()))
                    .append("; ");
            lastSemicolon = s.lastIndexOf(";");
            s.delete(lastSemicolon - 2, lastSemicolon);
        }
        return s.toString();
    }

    private String checkForSuitability(String key, String value) {

        if (value.toLowerCase().contains(key.toLowerCase())) {
            return "";
        }
        return value + ", ";
    }
}
