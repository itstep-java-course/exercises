package com.itstep.dudkin_homework;

public class ValidationException extends Exception {
    ValidationException(){
        super("Incorrect password");
    }
}
