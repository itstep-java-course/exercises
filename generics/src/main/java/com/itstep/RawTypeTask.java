package com.itstep;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RawTypeTask {
    public static void main(String[] args) {
//        Type type = new Type();
//        List<String> strings = Collections.singletonList("str");
//        type.test(strings);

        Type<?> type2 = new Type<>();
        List<String> strings2 = Collections.singletonList("str");
        type2.test(strings2);

    }

    private static class Type<T> {
        public <E> void test(Collection<E> collection) {
            for (E e : collection) {
                System.out.println(e);
            }
        }

        public void test(List<Integer> ints) {
            for (Integer i : ints) {
                System.out.println(i);
            }
        }
    }
}
