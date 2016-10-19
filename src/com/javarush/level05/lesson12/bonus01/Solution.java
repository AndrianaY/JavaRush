package com.javarush.level05.lesson12.bonus01;

import java.io.*;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два числа с клавиатуры и выводит их сумму на экран.
*/

public class Solution
{
   public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sA = bufferedReader.readLine();
        int a = Integer.parseInt(sA);
        String sB = bufferedReader.readLine();
        int b = Integer.parseInt(sB);

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
