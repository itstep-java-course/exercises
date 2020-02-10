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

    public Bank(int n, double initialBalance) {
        accounts = new double[n];
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

    public void transfer(int from, int to, double amount) {
        if (accounts[from] < amount) return;
        System.out.println(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf("%10.2f с 2f %d на %d", amount, from, to);
        accounts[to] += amount;
        System.out.printf("Общий балансЖ %10.2f%n", getTotalBalance());
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
