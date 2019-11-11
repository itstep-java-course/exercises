package com.itstep.cl.object.huk_homework;

/*1. Создать класс с именем Reverser. У класса должно быть одно поле String inputString.
Это поле должно инициализироваться при создании объекта Reverser. Добавить метод doReverse(),
который будет возвращать строку с обратной последовательностью символов. В методе мейн вывести строку
Пример: String inputString = “hello”, метод doReverse() должен вернуть строку “olleh”
*/

public class Reverser {//класс с именем Reverser


    private String inputString;//обычное поле класса inputString



    //тут присходит инициализация при создании Объекта Reverser
    public Reverser(String inputString) {//конструктор класса вызывающейся при создании нового объекта данного класса. Конструкторы выполняют инициализацию объекта
        this.inputString = inputString;//представляет ссылку на текущий экземпляр класса, можем обращаться к переменным, методам объекта, а также вызывать его конструкторы
        //в данном случае указываем, что значение параметра hello присваивается полю inputString
    }


    public String doReverse() {
        String outString = "";
            for (int i = inputString.length() - 1; i >= 0; i--){
                outString = outString + inputString.charAt(i);                //System.out.print(ch[i]);
        } return outString;
    }

}

       /* String str = "hello";
        char[] chars = str.toCharArray();
        System.out.println("String str: " + str);
        for (int i = 0; i < chars.length; i++) {
            System.out.println("char[] chars: " + chars[i]);
        }
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println("char[] chars reverse: " + chars[i]);
        }*/





