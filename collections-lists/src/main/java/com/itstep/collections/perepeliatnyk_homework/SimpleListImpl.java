package com.itstep.collections.perepeliatnyk_homework;

import java.util.Arrays;

//https://habr.com/ru/post/128269/
public class SimpleListImpl<T> implements SimpleList<T> {

    private  Object[] elements;
    private int size;

    public SimpleListImpl(int initialCapacity) {
        if (initialCapacity == 0)elements = new Object[8];
        else if (initialCapacity < 0) throw new IllegalArgumentException("Negative Capacity: " + initialCapacity);
        else elements = new Object[initialCapacity];
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
        checkCapacity(size + 1);
        elements[size] = o;
        size++;
        return true;
    }

    private void checkCapacity(int minCapacity) {
        if (minCapacity > elements.length){
            int oldCapacity = elements.length;
            int newCapacity = oldCapacity + (oldCapacity /2) + 1;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    @Override
    public boolean remove(T o) {
        if (o != null){
            for (int i = 0; i < size ; i++) {
                if (o.equals(elements[i])){
                    delete(i);
                    return true;
                }
            }
        }return false;
    }

    private void delete(int i) {
        int elementsToShift = size - i - 1;
        if (elementsToShift > 0) System.arraycopy(elements, i + 1, elements, i, elementsToShift);
        size--;
        elements[size] = null;

    }

    @Override
    public void clear() {
        for (int i = 0; i < size ; i++) {
            elements[i] = null;
        }size = 0;
    }

    @Override
    public T get(int index) {
        checkRange(index);
        return (T) elements[index];
    }

    @Override
    public void add(int index, T element) {
        checkRange(index);
        checkCapacity(size + 1);
        System.arraycopy(elements, index, elements, index + 1,size - index);
        elements[index] = element;
        size++;
    }

    private void checkRange(int index) {
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException("Attempt to access beyond range with index:" + index);
        }
    }

    @Override
    public T remove(int index) {
        checkRange(index);
       T oldObject = (T)elements[index];
       delete(index);
       return  oldObject;
    }

    @Override
    public int indexOf(T o) {
        if (o != null){
            for (int i = 0; i < size ; i++) {
                if (o.equals(elements[i]))
                    return i;
            }
        }return -1;
    }
}
