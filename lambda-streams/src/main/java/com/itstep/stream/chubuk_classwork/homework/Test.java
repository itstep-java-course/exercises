package com.itstep.stream.chubuk_classwork.homework;

public class Test {
    private   static final int COUNTS = 10;
    private   static final int INITIAL_BALANCE = 10;


    public static void main(String[] args) throws InterruptedException {
        Bank b = new Bank(COUNTS, INITIAL_BALANCE);
        for (int i = 0; i < COUNTS ; i++) {
            Transformer transformer = new Transformer(b, i, INITIAL_BALANCE);
            Thread t = new Thread(transformer);
            t.setUncaughtExceptionHandler((d, e) -> System.out.println("Thread: " + d + " Exception: " + e));

            t.start();
            t.sleep(2000);
            t.interrupt();
        }
    }
}
