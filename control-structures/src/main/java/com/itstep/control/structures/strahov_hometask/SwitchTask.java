package com.itstep.control.structures.strahov_hometask;

public class SwitchTask {public static void main(String[] args){
    defineAnimalByVoice("Reference");
    defineAnimalByVoice("To derive");
    defineAnimalByVoice("To emerge");
}
    String voice="To derive";


    private static void defineAnimalByVoice(String voice) {
        switch (voice) {
            case "Reference":
                System.out.println("Вспоминать");
                break;
            case "To derive":
                System.out.println("Получать");
                break;
            case "To emerge":
                System.out.println("Появляться");
                break;
            default:
                System.out.println("что-то непонятное");
        }
    }
}

