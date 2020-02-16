package com.itstep.likhomanov_homework;

class Teller implements Runnable {

    private final Bank bank;

    Teller(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {

        while (!Thread.currentThread().isInterrupted()) {

            showTotalAmountOfMoney();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void showTotalAmountOfMoney() {
        int moneyInTheBank = bank.getAccounts()
                                 .keySet()
                                 .stream()
                                 .mapToInt(key -> bank.getAccount(key).getBalance())
                                 .sum();
        System.out.println("++++++++++ Teller ++++++++++");
        System.out.println("Total amount of money in the bank: " + moneyInTheBank + "$");
        System.out.println("++++++++++++++++++++++++++++");
    }
}
