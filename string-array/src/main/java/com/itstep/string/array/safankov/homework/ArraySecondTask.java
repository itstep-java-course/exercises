package com.itstep.string.array.safankov.homework;

public class ArraySecondTask {
    public static void main(String[] args) {
        String slovo = "hello_java_world";
        System.out.println("Возвращаемое значение: ");
        for (String slovo2 : slovo.split("_")) {
            System.out.println(slovo2);
        }
        System.out.println(".......................");
        System.out.println("Вывод 2 и 3 символа каждого слова : ");
        for (String slovo2 : slovo.split("_")) {
            char a = slovo2.charAt(2);
            char b = slovo2.charAt(3);
            System.out.println(a +""+""+b);
        }
        System.out.println(".......................");
        for (String slovo2 : slovo.split("_")) {
            String changeletters = slovo2.replace("o", "$");
            System.out.println(changeletters);
        }

}
}
