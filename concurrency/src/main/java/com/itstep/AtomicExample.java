package com.itstep;

import java.util.concurrent.atomic.AtomicInteger;

//https://www.javacodemonk.com/what-is-atomicinteger-class-and-how-it-works-internally-1cda6a56
public class AtomicExample {

    private static final AtomicInteger counter = new AtomicInteger();

    public static void main(String[] args) {
        final int i = counter.addAndGet(5);
    }

    //volatile works for true and false and don't work for increment
}
