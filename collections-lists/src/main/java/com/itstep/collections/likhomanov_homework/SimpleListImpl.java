package com.itstep.collections.likhomanov_homework;

import java.util.Arrays;

//https://habr.com/ru/post/128269/
public class SimpleListImpl<T> implements SimpleList<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private static final int MAX_ARRAY_LENGTH = Integer.MAX_VALUE - 8;
    private static final Object[] DEFAULT_EMPTY_ARRAY = {};

    private Object[] elements;
    private int size;

    public SimpleListImpl() {
        this.elements = DEFAULT_EMPTY_ARRAY;
    }

    public SimpleListImpl(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elements = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elements = DEFAULT_EMPTY_ARRAY;
        } else {
            throw new IllegalArgumentException("Negative Capacity: " + initialCapacity);
        }
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

    //equation size*3/2 + 1
    @Override
    public boolean add(T o) {
        ensureCapacity(size + 1);
        elements[size++] = o;
        return true;
    }

    @Override
    public boolean remove(T o) {
        if (o == null) {
            for (int index = 0; index < size; ++index) {
                if (elements[index] == null) {
                    obliterate(index);
                    return true;
                }
            }
        } else {
            for (int index = 0; index < size; ++index) {
                if (o.equals(elements[index])) {
                    obliterate(index);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (int index = 0; index < size; index++) {
            elements[index] = null;
        }
        size = 0;
    }

    @Override
    public T get(int index) {
        checkRange(index);
        return (T) elements[index];
    }

    @Override
    public void add(int index, T element) {
        checkRange(index);
        ensureCapacity(size + 1);

        System.arraycopy(elements, index, elements, index + 1,size - index);

        elements[index] = element;
        size++;
    }

    @Override
    public T remove(int index) {
        checkRange(index);

        T oldElement = (T) elements[index];

        obliterate(index);

        return oldElement;
    }

    @Override
    public int indexOf(T o) {
        if (o == null) {
            for (int index = 0; index < size; ++index) {
                if (elements[index] == null) return index;
            }
        } else {
            for (int index = 0; index < size; ++index) {
                if (o.equals(elements[index])) return index;
            }
        }
        return -1;
    }

    public void trimToSize() {
        if (size < elements.length) {
            elements = (size == 0) ? DEFAULT_EMPTY_ARRAY : Arrays.copyOf(elements, size);
        }
    }

    private void grow(int minCapacity) {
        int oldCapacity = elements.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1) + 1;

        if (newCapacity < minCapacity) newCapacity = minCapacity;

        if (newCapacity > MAX_ARRAY_LENGTH) newCapacity = Integer.MAX_VALUE;

        if (newCapacity < 0) throw new OutOfMemoryError();

        elements = Arrays.copyOf(elements, newCapacity);
    }

    private void checkRange(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException("Attempt to access beyond range with index:" + index);
    }

    private void ensureCapacity(int minCapacity) {
        if (elements == DEFAULT_EMPTY_ARRAY) {
            grow(DEFAULT_CAPACITY);
            return;
        }

        if (minCapacity > elements.length)
            grow(minCapacity);
    }

    private void obliterate(int index) {

        int elementsToShift = size - index - 1;

        if (elementsToShift > 0) System.arraycopy(elements, index + 1, elements, index, elementsToShift);

        elements[--size] = null;
    }
}
