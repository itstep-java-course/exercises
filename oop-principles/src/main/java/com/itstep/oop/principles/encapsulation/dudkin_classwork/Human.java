package com.itstep.oop.principles.encapsulation.dudkin_classwork;

public class Human {
    public static void main(String[] args) {
        int result=95;
        String motto="Born to win";
        Recruitment company=new Recruitment(result,motto);
        company.getInfoAboutWork();
    }
}
