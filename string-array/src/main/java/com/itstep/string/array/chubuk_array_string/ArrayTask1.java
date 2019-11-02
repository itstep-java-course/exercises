package com.itstep.string.array.chubuk_array_string;

public class ArrayTask1
{
    public static void main(String[] args)
    {
        String[] array = {"hostel", "courses", "University",
                "book", "laptop", "river", "area"};
        for (int i = 0; i < array.length; i++)
        {
            if (array[i].length()<=5)
                System.out.println(array[i]);
            if (array[i].startsWith("r"))
                System.out.println("words staring with 'r':" + array[i]);
            if (array[i].endsWith("a"))
                System.out.println("words ending with 'a':" + array[i]);
        }
        System.out.println("array length is:"+ array.length);
    }
}
