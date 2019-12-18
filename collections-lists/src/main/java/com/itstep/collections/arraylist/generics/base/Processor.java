package com.itstep.collections.arraylist.generics.base;

public interface Processor<T, E> {
    T process(T item);

    T process(E element, T item);
}
