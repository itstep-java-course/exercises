package Test2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Type {
    public static void main(String[] args) {
        String name = "Tom";
        int age = 30;
        float height = 1.78566f;//округляет

        byte varByte = 127;
        short varShort = 32767;
        int varInt1 = 2147483646;
        int varInt2 = 2147483647;
       /*
        int num13 = 0b1101; // 2-ичная система, число 13
        Для задания шестнадцатеричного значения после символов 0x указывается число в шестнадцатеричном формате.
        Таким же образом восьмеричное значение указывается после символа 0, а двоичное значение - после символов 0b.
        */
        long varLong = 9223372036854775807L; //l малую лучше не писать, лекго спутать с 1 //как через подчеркивание записать?
        /*
        Также целые числа поддерживают разделение разрядов числа с помощью знака подчеркивания:
        int x = 123_456;
        int y = 234_567__789;
        */
        double varDouble = 44.4444;
        float varFloat = 55.55555F;//f
        char varChar1 = 'C';
        char varChar2 = 127;
        char varChar3 = '\u0066';
        boolean varBoolean = false;


        System.out.println("varByte = " + varByte);
        System.out.println("varShort = " + varShort);
        System.out.println("varInt = " + varInt1);
        System.out.printf("varInt1 = %d; varInt2 = %d \n", varInt1, varInt2);
        /*
        В данном случае символы %d обозначают спецификатор, вместо которого подставляет один из аргументов.
        Спецификаторов и соответствующих им аргументов может быть множество. В данном случае у нас только два аргумента, поэтому вместо первого %d подставляет значение переменной x, а вместо второго - значение переменной y. Сама буква d означает, что данный спецификатор будет использоваться для вывода целочисленных значений.
        Кроме спецификатора %d мы можем использовать еще ряд спецификаторов для других типов данных:

    %x: для вывода шестнадцатеричных чисел
    %f: для вывода чисел с плавающей точкой
    %e: для вывода чисел в экспоненциальной форме, например, 1.3e+01
    %c: для вывода одиночного символа
    %s: для вывода строковых значений
         */
        System.out.printf("Name: %s;  Age: %d;  Height: %.3f; \n", name, age, height);
        /*При выводе чисел с плавающей точкой мы можем указать количество знаков после запятой,
        для этого используем спецификатор на %.3f, где .3 указывает, что после запятой будет три знака.
        ОКРУГЛЯЕТ!!!
        * */
        System.out.println("varLong = " + varLong);
        System.out.println("varDouble = " + varDouble);
        System.out.println("varFloat = " + varFloat);
        System.out.println("varChar1 = " + varChar1);
        System.out.println("varChar2 = " + varChar2);
        System.out.println("varChar3 = " + varChar3);
        System.out.println("varBoolean = " + varBoolean);


        System.out.println("------------------------------");
        System.out.println("varByte+varByte = " + varByte+varByte);
        System.out.println("varByte+varShort = " + varByte+varShort);
        System.out.println("varByte+varInt1 = " + varByte+varInt1);
        System.out.println("varByte+varInt2 = " + varByte+varInt2);
        System.out.println("varByte+varSLong = " + varByte+varLong);
        System.out.println("varByte+varDouble = " + varByte+varDouble);
        System.out.println("varByte+varFloat = " + varByte+varFloat);
        System.out.println("varByte+varChar1 = " + varByte+varChar1);
        System.out.println("varByte+varChar2 = " + varByte+varChar2);
        System.out.println("varByte+varChar3 = " + varByte+varChar3);

        System.out.println("------------------------------");
        System.out.println("varShort*varByte = " + varShort*varByte);
        System.out.println("varShort*varShort = " + varShort*varShort);
        System.out.println("varShort*varInt1 = " + varByte*varInt1);
        System.out.println("varShort*varInt2 = " + varByte*varInt2);
        System.out.println("varShort*varSLong = " + varByte*varLong);
        System.out.println("varShort*varDouble = " + varByte*varDouble);
        System.out.println("varShort*varFloat = " + varByte*varFloat);
        System.out.println("varShort*varChar1 = " + varByte*varChar1);
        System.out.println("varShort*varChar2 = " + varByte*varChar2);
        System.out.println("varShort*varChar3 = " + varByte*varChar3);

    }
}
