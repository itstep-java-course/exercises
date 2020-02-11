package com.itstep.huk_homework;

import java.util.TreeMap;

public class UnsynchBankTest {
    /**
     * Демонстрирует повреждение данных при доступе множества потоков
     * к одной структуре данных.
     */

    public  static final int NACCOUNTS = 10;
    public  static final int INITIAL_BALANCE = 10;


    public static void main(String[] args) {
        Bank b = new Bank(NACCOUNTS, INITIAL_BALANCE);
        for (int i = 0; i < NACCOUNTS ; i++) {
            TransferRunnable r =new TransferRunnable(b, i, INITIAL_BALANCE);
            Thread t = new Thread(r);
            t.start();
        }
    }
}
