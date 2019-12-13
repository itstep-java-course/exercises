package com.itstep.collections.arraylist.generics;

public class BmwCarsProvider implements CarsProvider<Bmw> {
    @Override
    public Bmw getCar() {
        return new Bmw();
    }
}
