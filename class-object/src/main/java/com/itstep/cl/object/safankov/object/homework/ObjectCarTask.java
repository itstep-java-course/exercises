package com.itstep.cl.object.safankov.object.homework;
public class ObjectCarTask {
    private String model;
    private String origin;      //страна производитель
    private String typeOfBody;  //тип кузова
    private String color;
    private double length;
    private double height;
    private ObjectCarTask(String model,String origin,String typeOfBody,String color,double length,double height ){
        this.color=color;
        this.height=height;
        this.length=length;
        this.model=model;
        this.origin=origin;
        this.typeOfBody=typeOfBody;
    }
    private String getCarInfo() {
        return "Модель машины: " + model + " страна производитель: " + origin + " тип кузова: " + typeOfBody + " цвет: " + color+ " длина: " +length+" высота:" +height;
    }
    public static void main(String[] args) {
        ObjectCarTask mazda = new ObjectCarTask("Cx7,","Япония,","седан,","белый,",5.2 ,1.73);
        ObjectCarTask bmw = new ObjectCarTask("M5,","Германия,","купе,","красный,",4.9 ,1.53);
        String carInfo = mazda.getCarInfo();
        String carInfo2 = bmw.getCarInfo();
        System.out.println(carInfo+"\n"+carInfo2);
    }
}
