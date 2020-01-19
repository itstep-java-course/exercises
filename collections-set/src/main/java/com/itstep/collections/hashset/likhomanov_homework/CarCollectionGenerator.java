package com.itstep.collections.hashset.likhomanov_homework;

import java.util.*;

import static com.itstep.collections.hashset.likhomanov_homework.BodyType.*;
import static com.itstep.collections.hashset.likhomanov_homework.Colour.*;

public class CarCollectionGenerator {

    private static final Car[] CARS = {
            new Car("524863", "Volkswagen Caddy", "2015", WHITE, MINIVAN),
            new Car("322486", "Renault Kangoo", "2015", WHITE, MINIVAN),
            new Car("947732", "Hyundai Santa FE", "2007", SILVER, SUV),
            new Car("843115", "Mazda 6", "2004", RED, SEDAN),
            new Car("200161", "Volkswagen Passat B8 TDI", "2015", WHITE, SEDAN),

            new Car("330049", "Volvo V50", "2009", BLACK, SEDAN),
            new Car("726881", "Renault Megane", "2014", BLUE, COUPE),
            new Car("951234", "Ford Focus", "2009", BLACK, SEDAN),
            new Car("324557", "BMW X5", "2011", GRAY, SUV),
            new Car("174433", "BMW 530 AC", "2001", BLACK, COUPE),

            new Car("772001", "Mitsubishi Grandis", "2006", GRAY, COUPE),
            new Car("541002", "Nissan Juke 1.6 AT", "2019", RED, SUV),
            new Car("852134", "INFINITY FX 35", "2007", BLACK, SUV),
            new Car("154423", "MAZDA CX-5", "2019", BLUE, SUV),
            new Car("384519", "ALFA ROMEO Stelvio", "2019", WHITE, SUV),

            new Car("208024", "MITSUBISHI Outlander", "2007", GRAY, SUV),
            new Car("371106", "FORD Fusion", "2014", ORANGE, SEDAN),
            new Car("532288", "ВАЗ 2115", "2011", GREEN, SEDAN),
            new Car("911733", "SKODA Fabia", "2006", RED, SEDAN),
            new Car("109442", "KIA Ceed", "2019", BLUE, COUPE)
    };

    public static List<Car> getListOfCars() {
        return Arrays.asList(CARS);
    }

    public static Set<Car> getSetOfCars() {
        Set<Car> cars = new HashSet<>();
        Collections.addAll(cars, CARS);
        return cars;
    }
}
