package com.javarush.level09.lesson11.bonus02;

import javax.xml.soap.SOAPPart;
import java.io.*;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли, а уже потом считывать файл для записи.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();
try
{
    FileInputStream fileInputStream = new FileInputStream(sourceFileName);
}
catch(Exception e)
        {

            System.out.println("Файл не существует.");
            sourceFileName = reader.readLine();

        }
        FileInputStream fileInputStream2 = new FileInputStream(sourceFileName);
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);
            int data = fileInputStream2.read();
            fileOutputStream.write(data);



        fileInputStream2.close();
        fileOutputStream.close();
    }
}
