package com.itstep.cl.object.huk_homework;

//import java.util.Date;

import java.util.Date;

public class Car {

    //обычные поля класса
    private String model; //модель
    private String bodyType; //тип кузова
    private String color; //цвет
    private int numberOfSeats; //количество мест
    private double price; //цена
    private double maxSpeed; //максимальная скорость
    private String date; //дата выпуска

    //конструктор класса
    //тут присходит инициализация при создании Объекта Car
    public Car(String model, String bodyType, String color, int numberOfSeats, double price, double maxSpeed, String date) { //конструктор класса вызывающейся при создании нового объекта данного класса. Конструкторы выполняют инициализацию объекта
        //представляет ссылку на текущий экземпляр класса, можем обращаться к переменным, методам объекта, а также вызывать его конструкторы
        this.model = model;
        this.bodyType = bodyType;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.date = date;
    }

    public String getCarInfo() {
        return "The car model: " + model + " Body type: " + bodyType + " Color: " + color + " Number of seats: " + numberOfSeats + " Price: " + price + " Max speed: " + " Date: " + date;
    }
}

