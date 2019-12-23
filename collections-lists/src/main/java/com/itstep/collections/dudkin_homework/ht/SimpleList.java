package com.itstep.collections.dudkin_homework.ht;

public interface SimpleList<T> {
    int size();

    boolean isEmpty();

    boolean contains(T o);

    boolean add(T o);

    boolean remove(T o);

    void clear();

    T get(int index);

    void add(int index, T element);

    T remove(int index);

    int indexOf(T o);
}
