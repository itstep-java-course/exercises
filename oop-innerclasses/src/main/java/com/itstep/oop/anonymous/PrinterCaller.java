package com.itstep.oop.anonymous;

public class PrinterCaller {

    public void callPrinter(Printer printer) {
        try {
            printer.print();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
