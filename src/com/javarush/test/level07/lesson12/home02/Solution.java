package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        ArrayList<String> listStr = new ArrayList<String>();
        for (int i = 0; i < N; i++)
        {
            listStr.add(reader.readLine());
        }
        for(int j = 0; j < M; j++)
        {
            String temp = listStr.get(0);
            listStr.remove(0);
            listStr.add(temp);
       }

        for(int k = 0; k < N; k++)
        {
            System.out.println(listStr.get(k));
        }
    }
}
