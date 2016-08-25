package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException, NumberFormatException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fName1 = br.readLine();
        String fName2 = br.readLine();
        FileReader fr1 = new FileReader(fName1);
        FileWriter fr2 = new FileWriter(fName2);
        BufferedReader bfr = new BufferedReader(fr1);
        String[] temp;
        Integer numb = null;
        while(fr1.ready()){
            temp = bfr.readLine().split(" ");
            for (String s:temp
                 )
            {
                numb = Integer.parseInt(s);

                if(!(numb==null)){
                    fr2.write(numb);
                    fr2.write(" ");
                    numb = null;
                }

            }
        }
    }
}
