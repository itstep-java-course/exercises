package com.itstep.strahov_homework_bank;
//реализация переводящая деньги с одного счета на другой
public class TransferRunnable {
    //банк, между считами которого есть перевод
    //счет, с которого выполняеться перевод
    //максимальная сумма перевода
    public TransferRunnable(Bank b, int from , double max) {
        bank=b;
        fromAccount=from;
        maxAmount=max;
    }
    public void run() {
        try {
            while (true) {
                int toAccount = (int) (bank.size() * Math.random());
                double amount = maxAmount * Math.random();
                bank.transfer(fromAccount, toAccount, amount);
                Thread.sleep((int) (delay * Math.random()));
            }
        } catch (InterruptedException e) {

        }
    }
    private Bank bank;
    private int fromAccount;
    private double maxAmount;
    private int delay=10;
}
