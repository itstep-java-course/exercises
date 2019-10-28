package com.itstep.control.structures.shilov.hometask;

public class HomeTask3 {
    public class ControlOperatorSwitch {
        public static void main(String[] args) {
            Voice("Hello");
            Voice("World");
            Voice("home");
            Voice("car");
            Voice("beautiful");
        }


        private static void Voice(String voice) {
            switch (voice) {
                case "Hello":
                    System.out.println("привет");
                    break;
                case "World":
                    System.out.println("мир");
                    break;
                case "home":
                    System.out.println("дом");
                    break;
                case "beautiful":
                    System.out.println("прекрасный");
                    break;
                default:
                    System.out.println("что-то непонятное");
            }
        }
