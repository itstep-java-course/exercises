package com.itstep.collections.dudkin_hometask;

import com.itstep.collections.dudkin_hometask.Garage.MashinkaTypes;

import java.util.*;

public class CarTest {
    public static <showGroups> void main(String[] args) {
        Set<Car> carSet = new HashSet<>();
        carSet.add(new Car("23", "SR5", "red", MashinkaTypes.SEDAN, 2000));
        carSet.add(new Car("523", "SR6", "orange", MashinkaTypes.SEDAN, 2001));
        carSet.add(new Car("233", "S8", "green", MashinkaTypes.COUPE, 2020));
        carSet.add(new Car("223", "ER2", "blue", MashinkaTypes.SUV, 2003));
        carSet.add(new Car("23", "SR44", "red", MashinkaTypes.COUPE, 2019));
        carSet.add(new Car("263", "X5", "green", MashinkaTypes.COUPE, 2001));
        carSet.add(new Car("263", "FR33", "yellow", MashinkaTypes.SEDAN, 2000));
        carSet.add(new Car("234", "T5", "black", MashinkaTypes.SUV, 2002));
        carSet.add(new Car("263", "FN8", "yellow", MashinkaTypes.COUPE, 2014));
        carSet.add(new Car("723", "SW455", "white", MashinkaTypes.SEDAN, 2015));
        carSet.add(new Car("283", "DRP", "black", MashinkaTypes.SEDAN, 2014));
        carSet.add(new Car("239", "MMN45", "white", MashinkaTypes.SEDAN, 2016));
        carSet.add(new Car("023", "XER34", "blue", MashinkaTypes.SUV, 2019));
        carSet.add(new Car("234", "SVI", "blue", MashinkaTypes.COUPE, 2001));
        carSet.add(new Car("253", "T5", "black", MashinkaTypes.SUV, 2003));
        carSet.add(new Car("323", "X5", "grey", MashinkaTypes.COUPE, 2019));
        carSet.add(new Car("233", "S8", "orange", MashinkaTypes.SEDAN, 2020));
        carSet.add(new Car("423", "FN5", "brown", MashinkaTypes.SUV, 2010));
        carSet.add(new Car("235", "ER2", "brown", MashinkaTypes.SUV, 2005));
        carSet.add(new Car("123", "SR55", "green", MashinkaTypes.COUPE, 2010));
        String string=null;MashinkaTypes mashinkaTypes=MashinkaTypes.COUPE;Integer integer=25;
        showGroups(carSet,1,string);
        System.out.println("========================================");
        showGroups(carSet,2,mashinkaTypes);
        System.out.println("========================================");
        showGroups(carSet,3,integer);
    }
    public static<T>void showGroups(Set<Car> carSet, int groupType,T parametr) {
        Map<T, List<Car>> groupedBy = new HashMap<>();
        for (Car car : carSet) {
            T value=null;
            switch (groupType){
                case 1:
                    value= (T) car.getColor();
                    break;
                case 2:
                    value= (T) car.getType();
                    break;
                case 3:
                    value= (T) car.getYear();
                    break;
                default:
                    break;
            }
            if (!groupedBy.containsKey(value)) {
                List<Car> sameCharacteristic = new LinkedList<>();
                sameCharacteristic.add(car);
                groupedBy.put(value, sameCharacteristic);
            } else {
                List<Car> sameCharacteristic = groupedBy.get(value);
                sameCharacteristic.add(car);
                groupedBy.put(value, sameCharacteristic);
            }
        }
        for (Map.Entry<T, List<Car>> entry : groupedBy.entrySet()) {
            System.out.print(entry.getKey() + "->");
            int i = 0;
            for (Car car1 : entry.getValue()) {
                if (i != 0) System.out.print(";  ");
                System.out.print("vin:" + car1.getVin() + ",model:" + car1.getModel());
                switch (groupType) {
                    case 1:
                        System.out.print(",type:"+car1.getType()+",year:"+car1.getYear());
                        break;
                    case 2:
                        System.out.print(",color:"+car1.getColor()+",year:"+car1.getYear());
                        break;
                    case 3:
                        System.out.print(",color:"+car1.getColor()+",type:"+car1.getType());
                        break;
                    default:
                        break;
                }
                i++;
            }
            System.out.println();
        }
    }
}
