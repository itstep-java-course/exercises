package com.itstep.control.structures.strahov_classwork;

public class SwitchTask {
    //task3
    public static void main(String[] args){
        defineAnimalByVoice("Hello");
        defineAnimalByVoice("Bad");
        defineAnimalByVoice("Good");
    }
    String voice="Good";


    private static void defineAnimalByVoice(String voice) {
        switch (voice) {
            case "Hello":
                System.out.println("привет");
                break;
            case "bad":
                System.out.println("Плохой");
                break;
            case "Good":
                System.out.println("хорощий");
                break;
            default:
                System.out.println("что-то непонятное");
        }
    }
}

