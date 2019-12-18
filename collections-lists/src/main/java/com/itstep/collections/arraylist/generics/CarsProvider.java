package com.itstep.collections.arraylist.generics;

public interface CarsProvider<T extends Car> {
    T getCar();
}
