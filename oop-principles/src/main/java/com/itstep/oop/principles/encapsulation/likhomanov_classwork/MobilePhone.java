package com.itstep.oop.principles.encapsulation.likhomanov_classwork;

public class MobilePhone {

    private boolean isOn;

    public void switchOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Mobile is On");
        }
    }

    public void switchOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Mobile is Off");
        }
    }

    public void makeCall(String contact) {
        searchContacts(contact);
    }

    private void searchContacts(String contact) {
        switch (contact) {
            case "Mom":
                System.out.println("Calling to Mom");
                break;
            case "Dad":
                System.out.println("Calling to Dad");
                break;
            case "Sister":
                System.out.println("Calling to Sister");
                break;
            default:
                System.out.println("Contact not found");
        }
    }
}
