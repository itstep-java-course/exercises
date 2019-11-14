package com.itstep.oop.principles.encapsulation.likhomanov_classwork;

public class MobileUsing {

    public static void main(String[] args) {

        MobilePhone phone = new MobilePhone();

        phone.switchOn();
        phone.makeCall("Mom");
        phone.makeCall("Dad");
        phone.makeCall("Sister");
        phone.makeCall("Boss");
        phone.switchOff();
    }
}
