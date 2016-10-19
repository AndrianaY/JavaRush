package com.javarush.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Map<Integer, String> monthes = new HashMap<Integer, String>();
        monthes.put(1, "January");
        monthes.put(2, "February");
        monthes.put(3, "March");
        monthes.put(4, "April");
        monthes.put(5, "May");
        monthes.put(6, "June");
        monthes.put(7, "July");
        monthes.put(8, "August");
        monthes.put(9, "September");
        monthes.put(10, "October");
        monthes.put(11, "November");
        monthes.put(12, "December");

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        String whatMon = reader.readLine();

        for(Map.Entry<Integer, String> pair : monthes.entrySet())
        {
            String value = pair.getValue();
            Integer key = pair.getKey();
            if(value.equals(whatMon))
            {
                System.out.println(value + " is " + key  + " month");
            }
        }

    }

}
