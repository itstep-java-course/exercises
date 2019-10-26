package com.itstep.control.structures.dudkin_homework;

public class WhileHomeTask {
    public static void main(String[] args) {
        int x=20;
        while (true){
            if(x%2==0)
                System.out.println(x);
            if(x==2)
                break;
            else
            {
                x--;
                continue;
            }
        }
    }
}
