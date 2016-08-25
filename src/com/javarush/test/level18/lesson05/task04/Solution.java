package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream file1;
        FileOutputStream file2;
        List<Byte> list = new ArrayList<>();


        file1 = new FileInputStream(br.readLine());
        file2 = new FileOutputStream(br.readLine());


            while (file1.available() > 0)
            {
                list.add((byte) file1.read());
            }

        for (int i = (list.size() - 1); i>=0; i--)
        {
            file2.write(list.get(i));
        }

        br.close();
        file1.close();
        file2.close();
    }
}
