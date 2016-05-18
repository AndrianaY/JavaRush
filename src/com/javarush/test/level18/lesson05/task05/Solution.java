package com.javarush.test.level18.lesson05.task05;

/* DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки
2.2 выбросить исключение DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws DownloadException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            FileInputStream file = new FileInputStream(br.readLine());
            while (file.available() > 0)
            {
                if (file.available() < 1000)
                {
                    br.close();
                    file.close();
                    throw new DownloadException();
                }
                file = new FileInputStream(br.readLine());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

        public static class DownloadException extends Exception
        {


        }

}
