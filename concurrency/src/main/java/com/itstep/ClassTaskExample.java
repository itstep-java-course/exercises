package com.itstep;

public class ClassTaskExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            int x = 0;
            while (true) {
                x++;
                System.out.println("is interrupted flag: " + Thread.currentThread().isInterrupted());
                if (x == 10 && Thread.currentThread().isInterrupted()) {
                    System.out.println(x);
                    System.out.println("Stopping thread...");
                    return;
                }
            }
        });

        thread.setUncaughtExceptionHandler((t, e) -> System.out.println("Thread: " + t + " Exception: " + e));

        thread.start();
        thread.interrupt();
    }
}
