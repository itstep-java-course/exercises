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

public Bank(int n, double initialBalance){
    accounts = new double[n];
    for ( int i = 0; i < accounts.length; i++)
        accounts[i] = initialBalance;
}
/**
 * Перевод денег с одного счета на другой.
 * @param from Счет, с которого осуществляется перевод
 * @param to Счет, на который осуществляется перевод
 * @param amount Сумма перевода
 */


}
