package com.itstep.logical.operators;

public class SwitchOperator {
    public static void main(String[] args) {
        defineAnimalByVoice("gav");
        defineAnimalByVoice("ky-ky");
        defineAnimalByVoice("me-me");
        defineAnimalByVoice("be-be");
        defineAnimalByVoice("ky-ka-re-ky");
    }


    private static void defineAnimalByVoice(String voice) {
        switch (voice) {
            case "gav":
                System.out.println("собака");
                break;
            case "ky-ky":
                System.out.println("кукушка");
                break;
            case "me-me":
                System.out.println("овца");
                break;
            case "be-be":
                System.out.println("баран");
                break;
            default:
                System.out.println("что-то непонятное");
        }
    }

    // switch works with byte, short, char, int, Byte, Short, Character, Integer, String, Enum

}


