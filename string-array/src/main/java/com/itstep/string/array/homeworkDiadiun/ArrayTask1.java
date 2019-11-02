package com.itstep.string.array.homeworkDiadiun;

public class ArrayTask1 {
    public static void main(String[] args) {
        String[] array = {"itstep", "room", "Instagram",
                "Facebook", "Youtube", "arena", "school"};
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() <= 5)
                System.out.println(array[i]);
            if (array[i].startsWith("r"))
                System.out.println("Слова начинающиеся с 'r':" + array[i]);
            if (array[i].endsWith("a"))
                System.out.println("Слова заканчивающиеся на 'a':" + array[i]);
        }
        System.out.println("Длинна массива:" + array.length);
    }
}
