package com.itstep.oop.kukishev_classwork;

public class Elavator implements UpMoveable, DownMoveable, Stopable {


    private final Button[] buttons;

    private int currentFloor = 1;




    public Elavator(){
        Button firstFloorButton = new Button(1, "first");
        Button secondFloorButton = new Button(1, "second");
        Button thirdFloorButton = new Button(1, "third");

        Button emergency = new Button("Emetgency");
        Button stopButton = new Button("Stop");


        this.buttons = new Button []{
                firstFloorButton,
                secondFloorButton,
                thirdFloorButton,
                emergency,
                stopButton};
        }




        public void pressButton (String buttonName){
                if (buttonName == null){
                    return;
                }


                Button pressedButton = findPressedButton(buttonName);

                if (pressedButton == null){
                    return;
                }
                pressedButton.onClick();



            if (currentFloor > pressedButton.floor){
                moveDown();
            }
            else if (currentFloor == pressedButton.floor) {
                stop();

            } else {   moveUp();
            }
        }


        private Button findPressedButton(String buttonName){
        for (Button button : buttons){
            if (buttonName.equals(button.name)){
                return button;
            }

        }
        return null;
        }





    @Override
    public void moveDown() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void moveUp() {

    }

    private class Button{
        private final int floor;
        private final String name;


        private Button(int floor, String name) {
            this.floor = floor;
            this.name = name;
        }

        private Button (String name){
            this (0, name);

        }

        public int getFloor(){
            return floor;
        }

        public void onClick(){
            System.out.println("The button" + name + "has been pressed");

        }



    }


}
