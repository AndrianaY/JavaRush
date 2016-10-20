package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Arrays;


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[3];
        int j = 0;
        for (int i = 0; i < 3; i++)
        {
            num[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(num);
        for (j = 2; j >= 0; j--)
        {
            System.out.print(num[j] + " ");
        }
    }
}