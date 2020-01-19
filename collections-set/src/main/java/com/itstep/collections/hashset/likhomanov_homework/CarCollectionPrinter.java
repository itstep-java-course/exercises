package com.itstep.collections.hashset.likhomanov_homework;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CarCollectionPrinter {

    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println();
    }

    public static void printValue(Map<String, Set<Car>> cars, String key) {
        StringBuilder builder = new StringBuilder();
        int lastSemicolon;

        builder.append(key).append(" → ");

        for (Car car : cars.get(key)) {
            builder.append(checkForSuitability(key, car.getFullVin()))
                    .append(checkForSuitability(key, car.getFullModel()))
                    .append(checkForSuitability(key, car.getFullYear()))
                    .append(checkForSuitability(key, car.getFullColour()))
                    .append(checkForSuitability(key, car.getFullType()))
                    .append("; ");
            lastSemicolon = builder.lastIndexOf(";");
            builder.delete(lastSemicolon - 2, lastSemicolon);
        }

        System.out.println(builder);
    }

    private static String checkForSuitability(String key, String value) {

        if (value.toLowerCase().contains(key.toLowerCase())) {
            return "";
        }
        return value + ", ";
    }
}
