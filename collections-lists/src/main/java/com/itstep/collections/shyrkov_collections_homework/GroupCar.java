package com.itstep.collections.shyrkov_collections_homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GroupCar {

    public static Map<String, Set<Car>> groupByYear(Set<Car> carSet){

        Map<String, Set<Car>> yearMap = new HashMap<>();

        for (Car car : carSet) {
            if(yearMap.get(car.getYear())==null){
                Set<Car> cars = new HashSet<>();
                cars.add(car);
                yearMap.put(car.getYear(), cars);
            }
            else{
                yearMap.get(car.getYear()).add(car);
            }
        }
        return yearMap;
    }

    public static Map<String, Set<Car>> groupByColor(Set<Car> carSet){

        Map<String, Set<Car>> colorMap = new HashMap<>();

        for (Car car : carSet) {
            if(colorMap.get(car.getColor())==null){
                Set<Car> cars = new HashSet<>();
                cars.add(car);
                colorMap.put(car.getColor(), cars);
            }
            else{
                colorMap.get(car.getColor()).add(car);
            }
        }
        return colorMap;
    }

    public static Map<String, Set<Car>> groupByType(Set<Car> carSet){

        Map<String, Set<Car>> typeMap = new HashMap<>();

        for (Car car : carSet) {
            if(typeMap.get(car.getType())==null){
                Set<Car> cars = new HashSet<>();
                cars.add(car);
                typeMap.put(car.getType(), cars);
            }
            else{
                typeMap.get(car.getType()).add(car);
            }
        }
        return typeMap;
    }

}
