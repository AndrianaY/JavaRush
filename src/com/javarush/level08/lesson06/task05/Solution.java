package com.javarush.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций).
 Ничего измерять не нужно.
*/

public class Solution
{
    public static List  getListForGet()
    {
        List<String> arrListGet = new ArrayList<>();
        return arrListGet;

    }

    public static List  getListForSet()
    {
        List<String> arrListSet = new ArrayList<>();
        return arrListSet;

    }

    public static List  getListForAddOrInsert()
    {
        List<String> linkListAddIns = new LinkedList<>();
        return linkListAddIns;

    }

    public static List  getListForRemove()
    {
        List<String> linkListRem = new LinkedList<>();
        return linkListRem;

    }
}
