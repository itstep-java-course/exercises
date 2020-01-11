package com.itstep.collections.dudkin_homework.ht;

//https://habr.com/ru/post/128269/
public class SimpleListImpl<T> implements SimpleList<T> {

    private Object[] elements;

    public SimpleListImpl(int initialCapacity) {
        this.elements = new Object[initialCapacity];
    }

    @Override
    public int size() {
        int size = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null)
                size++;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null)
                return false;
        }
        return true;
    }

    @Override
    public boolean contains(T o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o)
                return true;
        }
        return false;
    }

    //formula size*3/2 + 1
    @Override
    public boolean add(T o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                elements[i] = o;
                return true;
            }
        }
        int size = elements.length * 3 / 2 + 1;
        Object[] objects = elements;
        elements = new Object[size];
        System.arraycopy(objects, 0, elements, 0, objects.length);
        elements[objects.length] = o;
        return true;
    }

    @Override
    public boolean remove(T o) {
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o)
                index = i;
        }
        if (index == -1)
            return false;
        remove(index);
        return true;
    }

    @Override
    public void clear() {
        elements = new Object[1];
    }

    @Override
    public T get(int index) {
        if (index > elements.length - 1)
            return null;
        return (T) elements[index];
    }

    @Override
    public void add(int index, T element) {
        int size = index;
        if (index > elements.length - 1) {
            size = size * 3 / 2 + 1;
            Object[] objects = elements;
            elements = new Object[size];
            System.arraycopy(objects, 0, elements, 0, objects.length);
        }
        elements[index] = element;
    }

    @Override
    public T remove(int index) {
        Object[] objects = elements;
        int size=0;
        if (index > elements.length - 1)
            return null;
        Object removedElem = elements[index];
        elements = new Object[elements.length - 1];
        if (index == 0)
            System.arraycopy(objects, 1, elements, 0,size);
        System.arraycopy(objects, 0, elements, 0, index);
        System.arraycopy(objects,index+1,elements,index+1,elements.length-index-1);
        return (T) removedElem;
    }

    @Override
    public int indexOf(T o) {
        int indexOf = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o)
                indexOf = i;
        }
        return indexOf;
    }
}
