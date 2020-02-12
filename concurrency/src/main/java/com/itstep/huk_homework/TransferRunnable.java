package com.itstep.huk_homework;

public class TransferRunnable implements Runnable{
    /**
     * Конструктор Runnable.
     * @param b Банк, между счетами которого выполняеться перевод
     * @param from Счет, с которого выполняеться перевод
     * @param  max Максимальная сумма одного перевода
     */

    private Bank bank;
    private int fromAccount;
    private double maxAmount;
    private  int DELAY = 10;

     public TransferRunnable(Bank b, int from, double max){
         this.bank = b;
         this.fromAccount = from;
         this.maxAmount = max;
     }

     public void run(){
         try {
             int x = 0;
             while (true) {
                 x++;
                 if (x == 10 && Thread.currentThread().isInterrupted()) {
                     int toAccount = (int) (bank.size() * Math.random());
                     double amount = maxAmount * Math.random();
                     bank.transfer(fromAccount, toAccount, amount);
                     Thread.sleep((int) (DELAY * Math.random()));
                     return;
                 }
             }
         }

         catch (InterruptedException e){
             //e.printStackTrace();
         }
     }
}
