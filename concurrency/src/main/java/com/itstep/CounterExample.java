package com.itstep;

import java.util.Random;

public class CounterExample {

    private int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        final CounterExample example = new CounterExample();
        example.increment();

        Thread.sleep(300);

        System.out.println(example.getCounter());
    }

    private void increment() {
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(new Random().nextInt(100));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                counter++;
            }).start();
        }
    }

    public int getCounter() {
        return counter;
    }
}
