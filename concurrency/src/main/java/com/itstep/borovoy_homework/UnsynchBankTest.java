package com.itstep.borovoy_homework;


public class UnsynchBankTest {


    private   static final int NACCOUNTS = 10;
    private   static final int INITIAL_BALANCE = 10;


    public static void main(String[] args) throws InterruptedException {
        Bank b = new Bank(NACCOUNTS, INITIAL_BALANCE);
        for (int i = 0; i < NACCOUNTS ; i++) {
            TransferRunnable r = new TransferRunnable(b, i, INITIAL_BALANCE);
            Thread t = new Thread(r);
            t.setUncaughtExceptionHandler((d, e) -> System.out.println("Thread: " + d + " Exception: " + e));

            t.start();
            t.sleep(2000);
            t.interrupt();
        }
    }
}
