package com.itstep.collections.hashset.likhomanov_homework.map_of_cars;

import com.itstep.collections.hashset.likhomanov_homework.Car;
import com.itstep.collections.hashset.likhomanov_homework.CarCollectionGenerator;
import com.itstep.collections.hashset.likhomanov_homework.CarCollectionGrader;
import com.itstep.collections.hashset.likhomanov_homework.CarCollectionPrinter;

import java.util.*;

class MapSortingTest {

    public static void main(String[] args) {

        final Set<Car> cars = CarCollectionGenerator.getSetOfCars();

        Map<String, Set<Car>> groupedByYearCars = CarCollectionGrader.group(cars, Car::getYear);
        Map<String, Set<Car>> groupedByColourCars = CarCollectionGrader.group(cars, Car::getColour);
        Map<String, Set<Car>> groupedByTypeCars = CarCollectionGrader.group(cars, Car::getType);

        CarCollectionPrinter.printValue(groupedByYearCars, "2019");
        CarCollectionPrinter.printValue(groupedByColourCars, "Red");
        CarCollectionPrinter.printValue(groupedByTypeCars, "Sedan");
    }
}
