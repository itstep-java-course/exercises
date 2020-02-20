package com.itstep.strahov_homework_bank;
// демонстрирует повреждение данных про доступе множества потоков к олной структуре данных
public class UnsynchBankTest {
    public static void main (String[] args ){
        final int naccounts=100;
        final double initial_banks=1000;
        Bank b = new Bank(naccounts , initial_banks);
        for (int i = 0; i <naccounts ; i++) {
            TransferRunnable r =new TransferRunnable(b, i, initial_banks);
            Thread t= new Thread(r);
            t.start();
        }
    }
}
