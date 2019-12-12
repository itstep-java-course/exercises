package com.itstep.inheritance_exception.huk_homework;

import javax.swing.*;

public class Test {
    public static void main(String[] args) throws PasswordNotValidException {
       Validator validator = new Validator("Poo123!");

       System.out.println(validator.isPasswordValid());


       try {
            if (validator.isPasswordValid()) {
                JOptionPane.showMessageDialog(null, "Вітаю! Ваш пароль відповідає вимозі!");
                //System.out.println("Вітаю! Ваш пароль відповідає вимозі!");
            }
        } catch (PasswordNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}
