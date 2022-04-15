package com.itstep.stream.chubuk_classwork.homework;

public class Bank {
    private final double[] accounts;
    private final Object locked = new Object();

    Bank(int n, double initialBalance) {
        this.accounts = new double[n];
        for (int i = 0; i < accounts.length; i++)
            accounts[i] = initialBalance;
    }

    void transfer(int from, int to, double amount) throws InterruptedException {
        if (accounts[from] < amount) return;
        System.out.println(Thread.currentThread().getName());
        synchronized (locked) {
            accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf(" Total Balance: %10.2f%n", getTotalBalance() + amount);
            Thread.sleep(4000);
        }
    }


    private double getTotalBalance() {
        double sum = 0;
        for (double a : accounts)
            sum += a;
        return sum;
    }

    int size() {
        return accounts.length;
    }
}
