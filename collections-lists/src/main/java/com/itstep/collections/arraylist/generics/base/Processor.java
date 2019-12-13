package com.itstep.collections.arraylist.generics.base;

public interface Processor {
    <T> T process(T item);

    <T, E> T process(E element, T item);
}
