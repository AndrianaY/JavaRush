package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;

import static com.javarush.test.level08.lesson08.task02.SetCreate.*;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main(String args[])
    {

        HashSet<Integer> setL = createSet();
        HashSet<Integer> integers;
        integers = removeAllNumbersMoreThan10(setL);
        System.out.println(integers);
    }

}

class SetCreate
 {


     public static HashSet<Integer> createSet()
     {
         HashSet<Integer> newSet = new HashSet<>();
         for (int i = 0; i < 20; i++)
         {
             Random random = new Random();
             int randomInt = random.nextInt(100);
             newSet.add(randomInt);
         }
         return newSet;
     }

     public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
     {
         for (Integer num : set)
         {
             if (num > 10)
             {
                 boolean isremoved = set.remove(num);
             }

         }
         return set;
     }
 }

