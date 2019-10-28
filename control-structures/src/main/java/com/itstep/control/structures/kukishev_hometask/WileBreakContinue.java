package com.itstep.control.structures.kukishev_hometask;

public class WileBreakContinue {

    public static void main(String[] args) {

        int x=20;

        while (x>=0){


            if (x % 2 != 0) {
                x--;
                continue;}
            else if (x==2){
                break;
            }
            System.out.println(x);
            x--;}

//            if (x%2==0){
//                System.out.println(x);
//                continue;}
//
//            else if (x==2){
//                break;
//            }
//            x--;}



    }




}
