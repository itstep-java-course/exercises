package com.itstep.borovoy_classwork;

public class StartThreadExample {
    public static void main(String[] args)   {

        final Thread thread = new Thread(() -> {
            System.out.println("Thread:" + Thread.currentThread().getName());
            for (int x = 1; x <= 10; x++) {

                if (x == 10 && Thread.currentThread().isInterrupted()) {
                    System.out.println(x);
                    System.out.println("Stopping thread");
                  return;
                }
            }
        });
        thread.setUncaughtExceptionHandler((t,e)-> System.out.println("Thread is interrupted"+t +e));
        thread.start();
        thread.interrupt();
    }
}

