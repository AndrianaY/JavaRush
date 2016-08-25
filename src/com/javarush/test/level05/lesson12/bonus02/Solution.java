package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] list = new int[5];
        for(int i = 0; i < 5; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }

//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());

        int minimum = min(list);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int[] arr)
    {
        int minim = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < minim)
                minim = arr[i];

        }
        return minim;
    }



}
