package com.itstep.huk_homework;

import java.io.File;
import java.io.IOException;

/*
ht_javaIO

При выполнении задания обязательно использовать ООП подходы и принципы

Задание

1. Создать 2 файла (используя java io). И записать в них следующие данные.

Контент первого:
id;name;last_name
1;Petr;Maksimov
5;Ivan;Egorov
2;Petr;Rakul
3;Miha;Dobkin
4;Danil;Maksimov

Контент второго:
id;street;house
1;Gagarina;25
2;Pushkina;17
4;Nauki;7
5;Bajana;33
3;Derjavinska;18


2. Вычитать содержимое 2-х файлов. и смержить данные по полю id
3. Записать данные в новый файл

Содержимое нового файла должно выглядеть так:
id;name;last_name;street;house
1;Petr;Maksimov;Gagarina;25
2;Petr;Rakul;Pushkina;17

4*.В конец каждой строки дописать возраст (произвольное двузначное число).
Строки должны выглядеть так
id;name;last_name;street;house;age
1;Petr;Maksimov;Gagarina;25;18
2;Petr;Rakul;Pushkina;17;23


 */

        public class CreateFile {

            public static void main(String[] args) throws IOException {

                final File dir = new File("input-output/src/main/java/com/itstep/huk_homework/myData");
                dir.mkdirs();
//              dir.delete();

                if (dir.exists()) {
                    System.out.println("Folder exists");
                }
                else if (! dir.exists()){
                    System.out.println("There is no such folder, I create a new one");
                    final File dir1 = new File("input-output/src/main/java/com/itstep/huk_homework/myData");
                    dir1.mkdirs();
                }


                final File file1 = new File("input-output/src/main/java/com/itstep/huk_homework/myData/text1.txt");
                final File file2 = new File("input-output/src/main/java/com/itstep/huk_homework/myData/text2.txt");
                file1.createNewFile();
                file2.createNewFile();
//              file1.delete();
//              file2.delete();


                if (file1.exists() && file2.exists()) {
                    System.out.println("Files created");
                }
                else if(! (file1.exists() && file2.exists())){
                    System.out.println("There are no such files, I create new ones");
                    final File file3 = new File("input-output/src/main/java/com/itstep/huk_homework/myData/text1.txt");
                    final File file4 = new File("input-output/src/main/java/com/itstep/huk_homework/myData/text2.txt");
                    file3.createNewFile();
                    file4.createNewFile();
                }


            }
        }

