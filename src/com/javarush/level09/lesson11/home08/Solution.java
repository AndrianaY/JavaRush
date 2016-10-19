package com.javarush.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list1 = new ArrayList<>();
        list1.add(new int[]{1, 2, 3, 4, 5});
        list1.add(new int[]{56, 8});
        list1.add(new int[]{65, 76, 78, 4});
        list1.add(new int[]{7, 3, 56, 2, 56, 56, 43});
        list1.add(new int[]{});
        return list1;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
