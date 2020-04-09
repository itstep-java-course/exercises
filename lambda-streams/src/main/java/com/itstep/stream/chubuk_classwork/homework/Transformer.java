package com.itstep.stream.chubuk_classwork.homework;

public class Transformer implements Runnable{
    private Bank bank;
    private int fromAccount;
    private double maxAmount;


    Transformer(Bank bank, int fromAccount, double maxAmount) {
        this.bank = bank;
        this.fromAccount = fromAccount;
        this.maxAmount = maxAmount;
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
