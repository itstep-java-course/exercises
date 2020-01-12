package com.itstep.collections.arraylist.shyrkov_homework;

import java.util.Arrays;

//https://habr.com/ru/post/128269/
public class SimpleListImpl<T> implements SimpleList<T> {

    private Object[] elements;
    private int size = 0;

    public SimpleListImpl(int initialCapacity) {
        this.elements = new Object[initialCapacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T o) {
        return indexOf(o) >= 0;
    }

    //formula size*3/2 + 1
    @Override
    public boolean add(T o) {

        if (size == elements.length) {
            Object[] temp = new Object[elements.length * 3 / 2 + 1];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            this.elements = temp;
        }
        this.elements[size++] = o;
        return true;
    }


    @Override
    public boolean remove(T o) {
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o)
                index = i;
        }
        if (index > 0) {
            remove(index);
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
    }

    @Override
    public T get(int index) {
        if (size <= index - 1 || index < 0) {
            return null;
        }
        return (T) elements[index];
    }

    @Override
    public void add(int index, T element) {
        if (size == elements.length) {
            Object[] temp = new Object[elements.length * 3 / 2 + 1];
            System.arraycopy(elements, index, temp, index + 1, elements.length - index);
            this.elements = temp;
        }
        this.elements[index] = element;
        size++;
    }

    @Override
    public T remove(int index) {
        if (index > elements.length - 1)
            return null;
        Object returnElem = elements[index];
        int numToMove = elements.length - index - 1;
        System.arraycopy(elements, index + 1, elements, index, numToMove);
        elements[--this.size] = null;
        return (T) returnElem;
    }

    @Override
    public int indexOf(T o) {
        if (o == null) {
            for (int i = 0; i < elements.length; i++)
                if (elements[i]==null)
                    return i;
        } else {
            for (int i = 0; i < elements.length; i++)
                if (o.equals(elements[i]))
                    return i;
        }
        return -1;
    }
}
