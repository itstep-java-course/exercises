package com.itstep.likhomanov_homework;

public class Account {

    private final int id;
    private int balance;

    Account(int id, int amount) {
        this.id = id;
        this.balance = amount;
    }

    synchronized int getMoney(int amount) {
        int change;

        if (amount > balance) {
            change = balance;
            balance = 0;
            return change;
        } else {
            balance = balance - amount;
            return amount;
        }
    }

    synchronized void putMoney(int amount) {
        balance = balance + amount;
    }

    synchronized int getBalance() {
        return balance;
    }

    int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Account id: " + id + "; " + "balance: " + balance + "$";
    }
}
