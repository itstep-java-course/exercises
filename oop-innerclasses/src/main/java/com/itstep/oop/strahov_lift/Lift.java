package com.itstep.oop.strahov_lift;

public class Lift implements UpMoveable,Stopable,DownMoveable {
    private final Button[] buttons;
    private int currentFloor=1;
    public Lift(){
        Button firstFloorButton=new Button(1,"first");
         Button secondFloorButton=new Button(2,"second");
         Button thirdFloorButton=new Button(3,"third");
         Button emergency=new Button("energency");
         Button stopButton=new Button("stop");
         this.buttons=new Button[]{
                 firstFloorButton,
                 secondFloorButton,
                 thirdFloorButton,
                 emergency,
                 stopButton,
         };

    }
    public void pressButton(String buttonName){
        if(buttonName==null){
            return;
        }
        Button presetButton = findPresetButton(buttonName);
        if(presetButton==null){
            presetButton.onClick();
        }
        presetButton.onClick();

        if(currentFloor>presetButton.floor){
            moveDown();
        }
        else if (currentFloor==presetButton.floor) {
            stop();
        }
        else  {
            moveUp();
        }
    }
    private Button findPresetButton(String buttonName) {
        for (Button button : buttons) {
            if (buttonName.equals(button.name)) {
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
        public Button (String name ){
            this(0,name);
        }
        private int getFloor(){
            return floor;
        }
        public void onClick(){
            System.out.println("The button "+name+"has been pressed...");
        }
    }
}
