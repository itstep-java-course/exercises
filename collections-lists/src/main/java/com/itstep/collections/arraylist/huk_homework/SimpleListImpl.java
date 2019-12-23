package com.itstep.collections.arraylist.huk_homework;


public class SimpleListImpl<T> implements SimpleList<T> {

    private Object[] elements; //поле константа массивов


    int index = 0;
    int count = 0;

    public SimpleListImpl(int initialCapacity) { //конструктор
        this.elements = new Object[initialCapacity];
    }

    @Override
    public int size() {
        for (int i = 0; i < elements.length; i++) {
            while
            (index <= count) ;
            count++;
           if (index == count)
               break;
        }
            return count;
    }


    @Override
    public boolean isEmpty() {
        return elements.length == 0;
    }

    @Override
    public boolean contains(T o) {
      //return indexOf(o) >= 0;
        for (int i = 0; i <elements.length ; i++) {
            if (elements[i]==o);
            return true;
        }
        return false;
    }

    @Override
    public boolean add(T o) { // в конец

        if (index == elements.length) {
            Object[] temp = new Object[elements.length * 3 / 2 + 1];
            System.arraycopy(elements,0,temp,0,elements.length);
            this.elements = temp;
        }
        this.elements[index++] = o;// index++ записую обьект
        return true;
    }


    @Override
    public void add(int index, T element) { //добавление в середину
        if (index == elements.length) {
            Object[] temp = new Object[elements.length * 3 / 2 + 1];
            System.arraycopy(elements, index, elements, index + 1, elements.length - index);
            this.elements = temp;
        }
        this.elements[index] = element;// index записую обьект

    }

    @Override
    public boolean remove(T o) {
//        if (o == null) {
//            for (int index = 0; index < elements.length; index++)
//                if (elements[index] == null) {
//                    fastRemove(index);
//                    return true;
//                }
//        } else {
//            for (int index = 0; index < elements.length; index++)
//                if (o.equals(elements[index])) {
//                    fastRemove(index);
//                    return true;
//                }
//        }
        return false;
    }

    @Override
    public void clear() {

        // clear to let GC do its work
        for (int index = 0; index < elements.length; index++) {
            elements[index] = null;
        }
//????????????
    }



    @Override
    public T get(int index) {
        return (T) elements[index]; //нужно только добавить проверку что индекс который ты передаешь в пределах массива
    }


    @Override
    public T remove(int index) {
        return null;
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
