package com.itstep.collections.hashset.likhomanov_homework.map_of_cars;

import com.itstep.collections.hashset.likhomanov_homework.Car;
import com.itstep.collections.hashset.likhomanov_homework.CarCollectionGenerator;
import com.itstep.collections.hashset.likhomanov_homework.CarCollectionSorter;
import com.itstep.collections.hashset.likhomanov_homework.CarCollectionPrinter;

import java.util.*;

class MapSortingTest {

    public static void main(String[] args) {

        final Set<Car> cars = CarCollectionGenerator.getSetOfCars();

        Map<String, Set<Car>> sortedByYearCars = CarCollectionSorter.sort(cars, Car::getYear);
        Map<String, Set<Car>> sortedByColourCars = CarCollectionSorter.sort(cars, Car::getColour);
        Map<String, Set<Car>> sortedByTypeCars = CarCollectionSorter.sort(cars, Car::getType);

        CarCollectionPrinter.printValue(sortedByYearCars, "2019");
        CarCollectionPrinter.printValue(sortedByColourCars, "Red");
        CarCollectionPrinter.printValue(sortedByTypeCars, "Sedan");
    }
}
