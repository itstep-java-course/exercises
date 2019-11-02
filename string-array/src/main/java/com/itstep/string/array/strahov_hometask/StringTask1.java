package com.itstep.string.array.strahov_hometask;

public class StringTask1 {
    public static void main(String[] args) {
        String[] month = new String[4];

        month[0] = "reptember";
        month[1] = "december";
        month[2] = "november";
        month[3] = "october";
        for (int i = 0; i < month.length; i++) {
            if (month[i].length() <= 5) {
                System.out.println(month[i]);
            }
            if (month[i].startsWith("r")) {
                System.out.println("Слова начинающиеся с 'R':" + month[i]);
            }
            if (month[i].endsWith("a")) {
                System.out.println("Слова заканчивающиеся на 'A':" + month[i]);
            }
        }
        System.out.println("Длинна массива:" + month.length);
    }
}

