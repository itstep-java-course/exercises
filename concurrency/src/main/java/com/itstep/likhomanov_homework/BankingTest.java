package com.itstep.likhomanov_homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankingTest {

    private static final int NUMBER_OF_ACCOUNTS = 100;
    private static final int INITIAL_BALANCE = 1000;

    public static void main(String[] args) {

        final Bank bank = new Bank();
        bank.createAccounts(NUMBER_OF_ACCOUNTS, INITIAL_BALANCE);

        final ExecutorService service = Executors.newFixedThreadPool(11);

        for (int i = 0; i < 10; i++) {
            service.submit(new Client(bank));
        }

        service.submit(new Teller(bank));
    }
}
