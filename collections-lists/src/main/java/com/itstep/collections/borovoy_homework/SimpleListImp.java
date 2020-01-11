package com.itstep.collections.borovoy_homework;


public class SimpleListImp<T> implements SimpleList<T> {

    private  Object[] elements;
    private  int size;

     SimpleListImp(int initialCapacity) {
        this.size=size;
        this.elements = new Object[initialCapacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return elements.length == 0;
    }

    @Override
    public boolean contains(T o) {

        if (elements.toString().contains((CharSequence) o))
        return true;
        return false;
    }

    //formula size*3/2 + 1
    @Override
    public boolean add(T o) {
        if (size == elements.length) {
            Object[] temp = new Object[elements.length * 3 / 2 + 1];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements=temp;
        }
        elements[size++] = o;
        return false;
    }

    @Override
    public boolean remove(T o) {
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i <elements.length ; i++) {
            elements[i]=0;
        }
    }

    @Override
    public T get(int index) {
        if (index>elements.length-1)
        return null;
        return (T) elements[index];
    }

    @Override
    public void add(int index, T element) {
        if (index == elements.length) {
            Object[] temp = new Object[elements.length * 3 / 2 + 1];
            System.arraycopy(elements,0,temp,0,elements.length);
        }

        this.elements[index++] = element;

    }

    @Override
    public T remove(int index) {
        for (int i = 0; i <elements.length ; i++) {
            if (index > elements.length - 1)
                return null;
        }

return null;
    }

    @Override
    public int indexOf(T o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elements[i]==null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (elements.equals(elements[i]))
                    return i;
        }
        return -1;
    }
}

