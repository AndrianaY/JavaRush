package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer max = 0;
        for (int i = 0; i < 4; i++)
        {
            Integer num = Integer.parseInt(reader.readLine());
            if (num > max)
            {
                max = num;
            }
        }
        System.out.println("Max is " + max);
    }
}

