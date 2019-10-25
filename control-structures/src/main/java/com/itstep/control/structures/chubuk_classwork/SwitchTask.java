package com.itstep.control.structures.chubuk_classwork;

public class SwitchTask {
    public static void main(String[] args) {
    translatorSwitch("hello");
    translatorSwitch("bad");
    translatorSwitch("good");
    translatorSwitch("mood");
}

    private static void translatorSwitch(String word) {
        switch (word) {
            case "hello":
                System.out.println("привет");
                break;
            case "bad":
                System.out.println("плохой");
                break;
            case "good":
                System.out.println("хорошо");
                break;
            default:
                System.out.println("что-то непонятное");
        }
    }
}

