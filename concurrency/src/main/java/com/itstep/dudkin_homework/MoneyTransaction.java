package com.itstep.dudkin_homework;

public class MoneyTransaction {
    final static Bank bank = new Bank(new Account(100), new Account(0));
    static Operation mainOperation = (account, sum, put) -> {
        if (put == true) {
            account.cash = account.cash + sum;
            return 1;
        } else if (account.cash >= sum) {
            System.out.println("С первого снято:" + sum);
            account.cash = account.cash - sum;
            return 1;
        } else
            return -1;
    };

    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            int finalI = (int) (Math.random() * 9+1);
            Thread thread = new Thread(() -> {
                try {
                    bank.transfer(finalI);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread.run();
            if (thread.isInterrupted()) thread.stop();
        }
    }

    private static class Bank {
        private Account firstAccount, secondAccount;

        Bank(Account firstAccount, Account secondAccount) {
            this.firstAccount = firstAccount;
            this.secondAccount = secondAccount;
        }

        private synchronized void transfer(int finalI) throws InterruptedException {
            if (firstAccount.cash == 0) {
                Thread.interrupted();
            }
            while (firstAccount.cash >= finalI) {
                if (mainOperation.cashOperation(firstAccount, finalI, false) == 1) {
                    mainOperation.cashOperation(secondAccount, finalI, true);
                    System.out.println("Остаток:"+firstAccount.cash);
                }
                else
                    wait();
            }
            notifyAll();
        }
    }

    private interface Operation {
        int cashOperation(Account account, int sum, boolean put);
    }

    private static class Account {
        int cash;

        Account(int cash) {
            this.cash = cash;
        }
    }
}