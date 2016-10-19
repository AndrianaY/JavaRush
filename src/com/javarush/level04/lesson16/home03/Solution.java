package com.javarush.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int i;
        do{
            i = Integer.parseInt(br.readLine());
            sum = sum + i;

        }
        while(i != (-1));
        System.out.println(sum);
        //напишите тут ваш код
    }
}
