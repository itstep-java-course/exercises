package com.itstep.cl.object.kukishev_homework;

public class Reverser {

            private String inputString;
            public Reverser (String inputString){

                this.inputString = inputString;
            }

            private void doReverse(){
            char [] simbol = inputString.toCharArray();
                for (int i = simbol.length-1; i>=0; i-- ) {
                    System.out.println(simbol[i]);
                }


            }

    public static void main(String[] args) {
        Reverser output = new Reverser ("stratovarius");
        output.doReverse();


    }


}
