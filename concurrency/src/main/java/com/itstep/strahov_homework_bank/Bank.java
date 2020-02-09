package com.itstep.strahov_homework_bank;
// банк со множеством счетов
public class Bank {
    //конструктор банка
    public Bank(int n, double initialBalance){
        accounts= new double [n];
        for (int i = 0; i <accounts.length ; i++) {
            accounts[i]=initialBalance;
        }
    }
    //перевод денег с олного счета на другой
    //с которго, на который и сколько
    public void transfer (int from, int to, double amount ){
        if (accounts[from]<amount)return;
        System.out.println(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf("%10.2f c %d",amount,from,to);
        accounts[from] += amount;
        System.out.printf("общий баланс:", getTotalBalance());

    }
    // получение суммарного баланса и вернуть общий баланс
    public double getTotalBalance(){
        double sum=0;
        for(double a:accounts)
            sum+=a;
        return sum;
    }
    //получение колличество счетов в банке и вернуть его
    public int size(){
        return accounts.length;
    }
    private final double[] accounts;
}
