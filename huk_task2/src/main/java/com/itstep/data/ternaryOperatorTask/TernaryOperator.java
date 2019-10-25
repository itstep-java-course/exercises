package com.itstep.data.ternaryOperatorTask;
/*2. Используя тернарный оператор описать следующее условие:
Если у меня будет хорошее настроение я пойду на курсы если нет - не пойду*/

public class TernaryOperator {
    public static void main(String[] args) {

        String  myDecision = goodMood() ? goCourses() : notGoCourses();
        System.out.println(myDecision);
        }

    /*    if (goodMood() == true) {
            System.out.println("I will GO to courses");;
        } else {
            System.out.println("I will NOT go to courses");;
        }
    }
    */

        private static boolean goodMood () {
            return true;
        }

        private static String goCourses () {
            return "I will GO to courses";
        }

        private static String notGoCourses () {
            return "I will NOT go to courses";
        }
    }








