package com.itstep.collections.arraylist.ht;

//https://habr.com/ru/post/128269/
public class SimpleListImpl<T> implements SimpleList<T> {

    private final Object[] elements;

    public SimpleListImpl(int initialCapacity) {
        this.elements = new Object[initialCapacity];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return elements.length == 0;
    }

    @Override
    public boolean contains(T o) {
        return false;
    }

    //formula size*3/2 + 1
    @Override
    public boolean add(T o) {
        return false;
    }

    @Override
    public boolean remove(T o) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(T o) {
        return 0;
    }
}
