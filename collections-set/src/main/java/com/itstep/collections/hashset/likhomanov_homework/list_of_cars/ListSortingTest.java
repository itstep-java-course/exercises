package com.itstep.collections.hashset.likhomanov_homework.list_of_cars;

import com.itstep.collections.hashset.likhomanov_homework.Cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortingTest {

    public static void main(String[] args) {
        ListSortingTest test = new ListSortingTest();

        List<Cars> cars = test.getListOfCars();

        System.out.println("Before sorting:");
        test.printList(cars);

        cars.sort(new Comparator<Cars>() {
            @Override
            public int compare(Cars o1, Cars o2) {
                return o1.getColour().compareToIgnoreCase(o2.getColour());
            }
        });

        System.out.println("After sorting:");
        test.printList(cars);
    }

    private List<Cars> getListOfCars() {
        List<Cars> cars = new ArrayList<>(20);
        Collections.addAll(cars, Cars.values());
        return cars;
    }

    private void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println();
    }
}
