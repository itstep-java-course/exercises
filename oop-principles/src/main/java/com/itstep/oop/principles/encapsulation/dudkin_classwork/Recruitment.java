package com.itstep.oop.principles.encapsulation.dudkin_classwork;

public class Recruitment {
    private int result;
    private String motto;

    public Recruitment(int result, String motto) {
        this.result = result;
        this.motto = motto;
    }

    private boolean bossAccess() {
        return (firstChallenge() && motto.length() > 5);
    }

    private boolean firstChallenge() {
        return (result > 80);
    }

    public void getInfoAboutWork() {
        if (firstChallenge() && bossAccess())
            System.out.println("Принят");
        else
            System.out.println("Пошёл вон");
    }
}
