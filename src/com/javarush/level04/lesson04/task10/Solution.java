package com.javarush.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, k, l;
        String s = "";
        i = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        l = Integer.parseInt(br.readLine());


            if(i==k){
                s = i + " " + k;
                if(k==l)
                    s = i + " " + k + " " + l;
            }
             else if(i==l){
                s = i + " " + l;
            }
            else if(k==l){
                s = k + " " + l;
            }
            System.out.println(s);



        //напишите тут ваш код

    }
}