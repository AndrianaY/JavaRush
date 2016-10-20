package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int k;
        int maximum = Integer.MIN_VALUE;
        while (n <= 0) //если N меньше 0, то вводим пока пока оно не станет больше 0
        {
            n = Integer.parseInt(reader.readLine());
        }


        for (int i = 0; i < n; i++){
            k = Integer.parseInt(reader.readLine());
            if(k > maximum){
                maximum = k;
            }

        }
        System.out.println(maximum);


        //напишите тут ваш код





    }
}
