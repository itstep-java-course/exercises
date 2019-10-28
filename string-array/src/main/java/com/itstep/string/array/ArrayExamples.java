package com.itstep.string.array;

public class ArrayExamples {
    public static void main(String[] args) {
        //create array, syntax
        //add element to array
        //retrieve element
        //remove element

        int[] arr = new int[5];
//        вывести элементы массива
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        добавить элемент в массив
//        arr[3] = 12;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        получение элемента из массива
//        arr[0] = 14;
//        arr[1] = 10;
//        arr[3] = 12;
//
//        int i1 = arr[1];
//        System.out.println(i1);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        удалить элемент из массива
//        arr[3] = 0;

//        String s = "value1_value2_value3";
//        String[] s1Array = s.split("_");
//        for (int i = 0; i < s1Array.length; i++) {
//            String x = s1Array[i];
//            System.out.println(x);
//        }

//        короткая запись
//        String[] sx = new String[]{"v1", "v2", "v3"};

        //        длинная запись
//        String[] sx2 = new String[3];
//        sx2[0] = "v1";
//        sx2[1] = "v2";
//        sx2[2] = "v3";
//
//        String[] sx3 = new String[]{"sdsds", "sdsdsd", "sdsdsd"};
//        for (int i = 0; i < sx3.length; i++) {
//            System.out.println(sx3[i]);
//        }


//        arr[4] = 4;
//
//        System.out.println(arr[4]);
//
//        for (int i : arr) {
//            System.out.println(i);
//        }
//
        int[][] arr_complex = new int[3][2];
        arr_complex[0] = new int[]{3, 4};
        arr_complex[1] = new int[]{4, 5};
        arr_complex[2] = new int[]{5, 6};

        for (int i = 0; i < arr_complex.length; i++) {
            for (int i1 = 0; i1 < arr_complex[i].length; i1++) {
                int element = arr_complex[i][i1];
                System.out.println(element);
            }
        }
    }
}
