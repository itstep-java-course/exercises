package com.itstep.likhomanov_homework;

import java.util.Random;

public class Client implements Runnable {

    private final Bank bank;

    public Client(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        Random random = new Random();
        int sum, fromId, toId;

        while (!Thread.currentThread().isInterrupted()) {
            fromId = random.nextInt(1000);
            toId = random.nextInt(1000);

            if (bank.getAccount(fromId) != null && bank.getAccount(toId) != null) {
                System.out.println("++++++++++" + Thread.currentThread().getName() + "++++++++++");
                System.out.println("Transaction info:");
                System.out.println("account id: " + fromId + " -> account id: " + toId);
                System.out.println("Balance before transaction:");
                System.out.println(bank.getAccount(fromId).toString());
                System.out.println(bank.getAccount(toId).toString());

                sum = bank.getAccount(fromId).getMoney(random.nextInt(100));
                bank.getAccount(toId).putMoney(sum);

                System.out.println("Sum: " + sum + "$");
                System.out.println("Balance after transaction:");
                System.out.println(bank.getAccount(fromId).toString());
                System.out.println(bank.getAccount(toId).toString());

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
