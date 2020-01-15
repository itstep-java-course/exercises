package com.itstep.collections.chubuk_homework;

public class SimpleListImpl<T> implements SimpleList<T> {

    private Object[] elements;

    public SimpleListImpl(int initialCapacity) {
        this.elements = new Object[initialCapacity];
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public boolean isEmpty() {
        return elements.length == 0;
    }

    @Override
    public boolean contains(T o) {
        return indexOf(o) >= 0;
    }

    //formula size*3/2 + 1
    @Override
    public boolean add(T o) {
        int length = elements.length;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                elements[i] = o;
                return true;
            }
        }
        Object[] object = new Object[elements.length * 3 / 2 + 1];
        System.arraycopy(elements, 0, object, 0, elements.length);
        elements = object;
        elements[length] = o;
        return true;
    }

    @Override
    public boolean remove(T o) {
        Object[] object = elements;
        for (int i = 0; i < elements.length; ++i) {
            if (o.equals(elements[i])) {
                for (int j = i; j < elements.length - 1; j++) {
                    object[j] = elements[j + 1];
                }
                System.arraycopy(elements, 0, object, 0, elements.length - 1);
            }
        }
        return true;
    }

    @Override
    public void clear() {
        elements = new Object[1];
    }

    @Override
    public T get(int index) {
        if (index > elements.length - 1) {
            return null;
        }
        return (T) elements[index];
    }

    @Override
    public void add(int index, T element) {
        if (index == elements.length) {
            Object[] object = new Object[elements.length * 3 / 2 + 1];
            System.arraycopy(elements, 0, object, 0, elements.length);
        }
        this.elements[index + 1] = element;
    }

    @Override
    public T remove(int index) {
        Object[] object = elements;
        for (int i = index; i < elements.length; i++) {
            object[i] = elements[i + 1];
        }
        System.arraycopy(elements, 0, object, 0, elements.length - 1);
        return null;
    }

    @Override
    public int indexOf(T o) {
        if (o == null) {
            for (int index = 0; index < elements.length; ++index) {
                if (elements[index] == null) return index;
            }
        } else {
            for (int index = 0; index < elements.length; ++index) {
                if (o.equals(elements[index])) return index;
            }
        }
        return -1;
    }
}

