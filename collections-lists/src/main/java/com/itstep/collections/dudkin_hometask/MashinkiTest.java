package com.itstep.collections.dudkin_hometask;

import com.itstep.collections.dudkin_hometask.Garage.Mashinka;
import com.itstep.collections.dudkin_hometask.Garage.MashinkaTypes;

import java.util.ArrayList;
import java.util.List;

public class MashinkiTest {
    public static void main(String[] args) {
        Mashinka[] cars = new Mashinka[12];
        cars[0] = new Mashinka("23", "SR5", "red", MashinkaTypes.SEDAN,3013);
        cars[1] = new Mashinka("523", "SR6", "orange", MashinkaTypes.COUPE,2005);
        cars[2] = new Mashinka("233", "S8", "green", MashinkaTypes.SUV,2006);
        cars[3] = new Mashinka("223", "ER2", "blue", MashinkaTypes.SUV,2005);
        cars[4] = new Mashinka("263", "X5", "green", MashinkaTypes.SEDAN,2000);
        cars[5] = new Mashinka("234", "T5", "black", MashinkaTypes.COUPE,1991);
        cars[6] = new Mashinka("263", "FN8", "yellow", MashinkaTypes.SEDAN,2000);
        cars[7] = new Mashinka("723", "SW455", "white", MashinkaTypes.COUPE,2019);
        cars[8] = new Mashinka("283", "DRP", "black", MashinkaTypes.SUV,2004);
        cars[9] = new Mashinka("239", "MMN45", "white", MashinkaTypes.COUPE,2001);
        cars[10] = new Mashinka("023", "XER34", "blue", MashinkaTypes.SEDAN,2000);
        cars[11] = new Mashinka("234", "SVI", "blue", MashinkaTypes.SEDAN,2003);
        List<Mashinka> carList = new ArrayList<>(12);
        for (int i = 0; i < cars.length; i++) {
            carList.add(cars[i]);
        }
        carList.sort(Mashinka::compareTo);
        for (int i = 0; i < carList.size(); i++) {
            carList.get(i).soutMashinkaInfo();
        }
    }
}
