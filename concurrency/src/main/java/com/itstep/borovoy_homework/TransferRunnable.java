package com.itstep.borovoy_homework;

public class TransferRunnable implements Runnable {


    private Bank bank;
    private int fromAccount;
    private double maxAmount;


     TransferRunnable(Bank b, int from, double max) {
        this.bank = b;
        this.fromAccount = from;
        this.maxAmount = max;
    }

    public void run() {
        try {
            int x = 0;
            while (true) {
                x++;
                if (x == 10 && Thread.currentThread().isInterrupted()) {
                    int toAccount = (int) (bank.size() * Math.random());
                    double amount = maxAmount * Math.random();
                    bank.transfer(fromAccount, toAccount, amount);
                    return;
                }
            }
        } catch (InterruptedException e) {
        }
    }
}
