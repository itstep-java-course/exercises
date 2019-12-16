package com.itstep.collections.arraylist.generics;

public class AudiCarsProvider implements CarsProvider<Audi> {
    @Override
    public Audi getCar() {
        return new Audi();
    }
}
