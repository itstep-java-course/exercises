package com.itstep.oop.principles.encapsulation.shyrkov_classwork;

public class Computer {
    private Boolean havePower;
    private Boolean isOn;

    public Computer(){
        havePower = false;
        isOn = false;
    }

    public void connectToElectricity(){
        if(!havePower)
            havePower = true;
        else
            System.out.println("Already on");
    }

    public void turnOn(){
        if(havePower) {
            if (!isOn) {
                loadSystem();
                System.out.println("System loaded");
            } else {
                closeSystem();
                System.out.println("System closed");
            }
        }
        else
        {
            System.out.println("Computer is not connected to electricity");
        }
    }

    private void loadSystem(){
        turnOnMonitor();
        loadDesktop();
        isOn = true;
    }

    private void turnOnMonitor(){
        System.out.println("Monitor on");
    }

    private void loadDesktop(){
        System.out.println("Desktop loaded");
    }

    private void closeSystem(){
        closeDesktop();
        turnOffMonitor();
        isOn = false;
    }

    private void turnOffMonitor(){
        System.out.println("Monitor off");
    }

    private void closeDesktop(){
        System.out.println("Desktop closed");
    }
}
