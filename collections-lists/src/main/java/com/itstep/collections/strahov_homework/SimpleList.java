package com.itstep.collections.strahov_homework;

public interface SimpleList <T>{
    int size();
    int indexOf(T o);
    void clear();
    void add (int index,T element );
    boolean isEmpty();
    boolean contains (T o);
    boolean remove (T o);
    boolean add (T o);
    T get (int index);
    T remove(int index );

}
