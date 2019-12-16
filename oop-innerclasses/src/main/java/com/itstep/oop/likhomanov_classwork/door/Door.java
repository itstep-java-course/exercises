package com.itstep.oop.likhomanov_classwork.door;

public class Door implements Openable, Closable{

    private boolean isOpen;

    @Override
    public void close() {
        isOpen = false;
    }

    @Override
    public void open() {
        isOpen = true;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
