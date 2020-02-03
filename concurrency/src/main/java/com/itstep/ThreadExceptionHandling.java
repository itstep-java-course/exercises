package com.itstep;

public class ThreadExceptionHandling {
    public static void main(String[] args) {
        final Thread thread = new Thread(() -> {
            int x = 0;
            while (x < 10) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                x++;
            }
            throw new RuntimeException("Exception");
        });
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Log exception: " + t.getName() + "  Exception: " + e.getMessage());
            }
        });

        thread.start();
    }
}
