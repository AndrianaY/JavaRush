package com.javarush.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileInputStream file = null;
        int readedByte;
        int count = 0;
        if(args.length > 0){
            file = new FileInputStream(args[0]);
        }
        while (file.available() > 0){
            readedByte = file.read();
            if(((readedByte>=65)&&(readedByte<=90)) || ((readedByte>=97)&&(readedByte<=122))){
                count = count + 1;
            }

        }
        System.out.println(count);
        file.close();
    }
}
