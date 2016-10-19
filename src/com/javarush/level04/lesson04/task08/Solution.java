package com.javarush.level04.lesson04.task08;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int nA = Integer.parseInt(bufferedReader.readLine());

        int nB = Integer.parseInt(bufferedReader.readLine());

        int nC = Integer.parseInt(bufferedReader.readLine());

        if((nA + nB) > nC)
        {
            if((nB + nC) > nA)
            {
                if((nC + nA) > nB)
                    System.out.println("Треугольник существует.");
                else
                    System.out.println("Треугольник не существует.");
            }
            else
                System.out.println("Треугольник не существует.");

        }
        else
            System.out.println("Треугольник не существует.");

    }
}