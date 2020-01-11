package com.itstep.oop.likhomanov_classwork.door;

public class Door implements Openable {

    private boolean isOpen;

    @Override
    public void open() {
        isOpen = true;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
