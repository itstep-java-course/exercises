package com.itstep.huk_homework;

/*
concurrency_ht
написать приложение банк которое переводит деньги из одного счета на другой
адаптировать приложение к многопоточной среде (10 потоков)
 */

public class Bank {
    /**
     * конструктор банка.
     * @param n Количество счетов
     * @param initialBalance Начальный баланс каждого счета
     */

    private final double[] accounts;
    private final Object lock = new Object();

    public Bank(int n, double initialBalance) {
        this.accounts = new double[n];
        for (int i = 0; i < accounts.length; i++)
            accounts[i] = initialBalance;
    }

    /**
     * Перевод денег с одного счета на другой.
     *
     * @param from   Счет, с которого осуществляется перевод
     * @param to     Счет, на который осуществляется перевод
     * @param amount Сумма перевода
     */

    public void transfer(int from, int to, double amount) throws InterruptedException {
        if (accounts[from] < amount) return;
        System.out.println(Thread.currentThread().getName()); //возвращает ссылку на текущий выполняющийся объект потока.
        synchronized (lock) {// специальная блокировка
            accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf(" Total Balance: %10.2f%n", getTotalBalance() + amount);
            Thread.sleep(4000);
        }
    }

    /**
     * Получить сумарный баланс.
     *
     * @return Общий баланс
     */

    public double getTotalBalance() {
        double sum = 0;
        for (double a : accounts)
            sum += a;
        return sum;
    }

    /**
     * Получить количество счетов в банке.
     *
     * @return Количество счетов
     */

    public int size() {
        return accounts.length;
    }


}
