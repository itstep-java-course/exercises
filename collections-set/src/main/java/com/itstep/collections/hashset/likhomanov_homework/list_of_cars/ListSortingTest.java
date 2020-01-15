package com.itstep.collections.hashset.likhomanov_homework.list_of_cars;

import com.itstep.collections.hashset.likhomanov_homework.Car;
import com.itstep.collections.hashset.likhomanov_homework.CarCollectionGenerator;
import com.itstep.collections.hashset.likhomanov_homework.CarCollectionPrinter;

import java.util.Comparator;
import java.util.List;

public class ListSortingTest {

    public static void main(String[] args) {

        List<Car> cars = CarCollectionGenerator.getListOfCars();

        System.out.println("Before sorting:");
        CarCollectionPrinter.printList(cars);

        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getColour().compareToIgnoreCase(o2.getColour());
            }
        });

        System.out.println("After sorting:");
        CarCollectionPrinter.printList(cars);
    }
}
