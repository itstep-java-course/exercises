package com.itstep.likhomanov_homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Bank {

    private final Map<Integer, Account> accounts;

    Bank() {
        this.accounts = new HashMap<>();
    }

    void createAccounts(int numberOfAccounts, int startBalance) {
        Random random = new Random();
        int randomId;

        for (int i = 0; i < numberOfAccounts; i++) {

            randomId = random.nextInt(1000);

            while (accounts.get(randomId) != null) {
                randomId = random.nextInt(1000);
            }

            accounts.put(randomId, new Account(randomId, startBalance));
        }
    }

    Account getAccount(int id) {
        return accounts.get(id);
    }

    Map<Integer, Account> getAccounts() {
        return accounts;
    }
}
