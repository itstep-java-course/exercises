package com.itstep.control.structures.shilov.hometask;

public class HomeTask21 {

        public static void main(String args[]){
            int mood = 3;
            int good = 4;
            if (mood == good)
            {
                System.out.println("go to courc");
            }
            else
            {
                System.out.println();
            }

//When I could do this:
            int courses = (3 == good) ? mood :good;

            boolean goodMood = false;
            int result;
            if (goodMood) {
                result = 0;
            }else {
                result = 12;
            }

            int result2 = goodMood ? 0 : 12;
        }
}
